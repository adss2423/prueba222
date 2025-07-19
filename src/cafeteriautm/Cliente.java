
package cafeteriautm;

/**
 *
 * @author IdiomasB102
 */
public class Cliente {
    //Atributos de clase
    int idCliente;
    String nombre;
    boolean tieneBeca;
    float porcentaje;
    
    public Cliente(int idCliente, String nombre, boolean tieneBeca, float porcentaje) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.tieneBeca = tieneBeca;
        this.porcentaje = porcentaje;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneBeca() {
        return tieneBeca;
    }

    public void setTieneBeca(boolean tieneBeca) {
        this.tieneBeca = tieneBeca;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public void mostrarDatosCliente() {
        System.out.println("Cve: "+ this.idCliente
                            +" - Nombre: "+this.getNombre()
                            +" - Beca: "+this.isTieneBeca()
                            +" - % Beca: "+this.getPorcentaje());
    }
    
}
