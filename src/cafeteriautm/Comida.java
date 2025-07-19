
package cafeteriautm;

/**
 *
 * @author IdiomasB102
 */
public class Comida{
    //Atributos de clase
    int idComida;
    String nombre;
    String ingredientes;
    byte precio;
    short minCoccion;
    int stock;
    
    public Comida(int idComida, String nombre, String ingredientes, byte precio, short minCoccion, int stock) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.minCoccion = minCoccion;
        this.stock = stock;
    }

    public int getIdProducto() {
        return idComida;
    }

    public void setIdProducto(int idProducto) {
        this.idComida = idProducto;
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
    
    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public short getMinCoccion() {
        return minCoccion;
    }

    public void setMinCoccion(short minutosCoccion) {
        this.minCoccion = minutosCoccion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public void mostrarDatosComida() {
        System.out.println("Cve: "+this.getIdProducto()
                            +" - Nombre: "+this.getNombre()
                            +" - Ingredientes: "+this.getIngredientes()
                            +" - Minutos de coccion: "+this.getMinCoccion()
                            +" - Precio: "+this.getPrecio()
                            +" - Stock: "+this.getStock());
    }
}
