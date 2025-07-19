
package cafeteriautm;

import java.util.ArrayList;

/**
 * 
 * 
 * @author TKA
 */
public class Pedido {
    //Atributos de clase
    int idPedido;
    String fecha;
    String hora;
    Cliente idCliente;
    int totalProductos;
    ArrayList<Comida> productosPedidosComida = new ArrayList<>();
    ArrayList<Integer> productosCantidadPedidosComida = new ArrayList<>();
    ArrayList<Bebida> productosPedidosBebida = new ArrayList<>();
    ArrayList<Integer> productosCantidadPedidosBebida = new ArrayList<>();
    float subTotal;
    
//    public Pedido(int idPedido, String fecha, String hora, Cliente idCliente, int totalProductos, float subTotal) {
//        this.idPedido = idPedido;
//        this.fecha = fecha;
//        this.hora = hora;
//        this.idCliente = idCliente;
//        this.totalProductos = totalProductos;
//        this.subTotal = subTotal;
//    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public ArrayList<Comida> getProductosPedidosComida() {
        return productosPedidosComida;
    }

    public void setProductosPedidosComida(ArrayList<Comida> productosPedidosComida) {
        this.productosPedidosComida = productosPedidosComida;
    }

    public ArrayList<Integer> getProductosCantidadPedidosComida() {
        return productosCantidadPedidosComida;
    }

    public void setProductosCantidadPedidosComida(ArrayList<Integer> productosCantidadPedidosComida) {
        this.productosCantidadPedidosComida = productosCantidadPedidosComida;
    }

    public ArrayList<Bebida> getProductosPedidosBebida() {
        return productosPedidosBebida;
    }

    public void setProductosPedidosBebida(ArrayList<Bebida> productosPedidosBebida) {
        this.productosPedidosBebida = productosPedidosBebida;
    }

    public ArrayList<Integer> getProductosCantidadPedidosBebida() {
        return productosCantidadPedidosBebida;
    }

    public void setProductosCantidadPedidosBebida(ArrayList<Integer> productosCantidadPedidosBebida) {
        this.productosCantidadPedidosBebida = productosCantidadPedidosBebida;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
    
    
}
