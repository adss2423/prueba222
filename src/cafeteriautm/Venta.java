
package cafeteriautm;

import java.util.ArrayList;

/**
 *
 * @author IdiomasB102
 */
public class Venta {
    //Atributos de clase
    int numVenta;
    int idEmpleado;
    String nombreEmpleado;
    int idCliente;
    String nombreCliente;
    ArrayList<Comida> pedidoComida = new ArrayList<>();
    ArrayList<Bebida> pedidoBebida = new ArrayList<>();
    double precio;
    String fecha;
    String hora;
    
    public Venta(int numVenta, int idEmpleado, String nombreEmpleado, int idCliente, String nombreCliente, ArrayList pedidoComida, ArrayList pedidoBebida, double precio, String fecha, String hora) {
        this.numVenta = numVenta;
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.pedidoComida = pedidoComida;
        this.pedidoBebida = pedidoBebida;
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
    public void mostrarDatosVenta() {
        System.out.println("#Venta: "+this.numVenta
                            +" - ID Empleado: "+this.idEmpleado
                            +" - Nombre Empleado: "+this.nombreEmpleado
                            +" - ID Cliente: "+this.idCliente
                            +" - Nombre Cliente: "+this.nombreCliente
                            +" - Cobro con descuento: "+this.precio
                            +" - Fecha: "+this.fecha
                            +" - Hora: "+this.hora);
        System.out.println("Productos:");
        for (int i = 0; i < pedidoComida.size(); i++) {
            System.out.println(pedidoComida.get(i).getNombre());
        }
        for (int i = 0; i < pedidoBebida.size(); i++) {
            System.out.println(pedidoBebida.get(i).getNombre());
        }
        
    }
    
    
    
    
}
