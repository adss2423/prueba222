
package cafeteriautm;

/**
 *
 * @author IdiomasB102
 */
public class Empleado {
    //Atributos de clase
    private int idEmpleado;
    private String nombre;
    private String turno;
    
    public Empleado(int idEmpleado, String nombre, String turno) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarDatosEmpleado() {
        System.out.println("Cve: "+this.getIdEmpleado()
                            +" - Nombre: "+this.getNombre()
                            +" - Turno: "+this.getTurno());
    }
}
