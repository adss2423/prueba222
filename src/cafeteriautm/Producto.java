
package cafeteriautm;

/**
 *
 * @author IdiomasB102
 */
public class Producto {
    //Atributos de clase
    int idProducto;
    String nombre;
    String tipoProducto;
    int cantidad;
    byte precio;
    int stock;
    
    public Producto(int idProducto, String nombre, String tipoProducto, byte precio, byte cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public String verificarDisponibilidad() {
        if (this.cantidad < this.stock) {
            return "Hay stock disponible.";
        } else {
            return "No hay stock disponible.";
        }
    }
    
    public void descontarProducto() {
        this.stock = this.stock - this.cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public void setStock(short stock) {
        this.stock = stock;
    }

    
    
    
}
