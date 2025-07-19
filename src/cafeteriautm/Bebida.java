
package cafeteriautm;

/**
 *
 * @author IdiomasB102
 */
public class Bebida {
    //Atributos de clase
    int idBebida;
    String nombre;
    String sabor;
    byte precio;
    int mililitros;
    int stock;
    String elpepe;

    
    public Bebida(int idBebida, String nombre, String sabor, byte precio, int mililitros, int stock) {
        this.idBebida = idBebida;
        this.nombre = nombre;
        this.sabor = sabor;
        this.precio = precio;
        this.mililitros = mililitros;
        this.stock = stock;
    }
    
    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getPrecio() {
        return precio;
    }

    public void setPrecio(byte precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }
    
    public void mostrarDatosBebida() {
        System.out.println("Cve: "+this.getIdBebida()
                            +" - Nombre: "+this.getNombre()
                            +" - Sabor: "+this.getSabor()
                            +" - Mililitros: "+this.getMililitros()
                            +" - Precio: "+this.getPrecio()
                            +" - Stock: "+this.getStock());
    }
    
    
}
