
package cafeteriautm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author IdiomasB102
 */
public class CafeteriaUTM {

        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Empleado> arregloEmpleados = new ArrayList<>();
        ArrayList<Cliente> arregloClientes = new ArrayList<>();
        ArrayList<Comida> arregloMenuComida = new ArrayList<>();
        ArrayList<Bebida> arregloMenuBebida = new ArrayList<>();
        ArrayList<Integer> arregloCantidadPedidosBebida = new ArrayList<>();
        ArrayList<Pedido> arregloPedidos = new ArrayList<>();
        ArrayList<Integer> arregloCantidadPedidosComida = new ArrayList<>();
        ArrayList<Venta> arregloVentas = new ArrayList<>();
        
        static int numPedido = 0;
        int numVenta = 0;
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteriaUTM cafeteria = new CafeteriaUTM();
        cafeteria.mostrarMenuPrincipal();
        
    }
    public void mostrarMenuPrincipal() {
        byte opcion = 0;
        
        do {
            System.out.println("----Cafeteria UTM----");
            System.out.println("1. Crear y mostrar empleados, clientes y productos");
            System.out.println("2. Levantar pedidos y ventas");
            System.out.println("3. Mostrar ventas");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextByte();
            switch (opcion) {
                case 1:
                    this.construirObjetosEmpleados();
                    this.mostrarObjetosEmpleados();
                    this.construirObjetosClientes();
                    this.mostrarObjetosClientes();
                    this.crearProductosComida();
                    this.crearProductosBebida();
                    this.mostrarProductosComida();
                    this.mostrarProductosBebida();
                    
                    break;
                case 2:
                    registrarPedidoCliente();
                    
                    break;
                case 3:
                    mostrarVentas();
                    
                    break;
            }
        } while (opcion != 4);
        
    }
    
    public void construirObjetosEmpleados() {
        Empleado empleado1 = new Empleado(1, "Pepe", "Matutino");
        Empleado empleado2 = new Empleado(2, "Jose", "Vespertino");
        arregloEmpleados.add(empleado1);
        arregloEmpleados.add(empleado2);
    }
    
    public void mostrarObjetosEmpleados() {
        for (int i = 0; i < arregloEmpleados.size(); i++) {
            arregloEmpleados.get(i).mostrarDatosEmpleado();
        }
    }
    
    public void construirObjetosClientes() {
        Cliente cliente1 = new Cliente(1, "Emmanuel", true, 50);
        Cliente cliente2 = new Cliente(2, "Antonio", false, 0);
        arregloClientes.add(cliente1);
        arregloClientes.add(cliente2);
    }
    
    public void mostrarObjetosClientes() {
        for (int i = 0; i < arregloClientes.size(); i++) {
            arregloClientes.get(i).mostrarDatosCliente();
        }
    }
    
    public void crearProductosComida() {
        Comida comida1 = new Comida(1, "Torta", "Milanesa", (byte) 35, (short) 5, 15);
        Comida comida2 = new Comida(2, "Chilaquiles", "Huevo, pollo y queso", (byte) 50, (short) 20, 29);
        Comida comida3 = new Comida(3, "Empanadas", "Queso y carne", (byte) 20, (short) 15, 30);
        arregloMenuComida.add(comida1);
        arregloCantidadPedidosComida.add(3);
        arregloMenuComida.add(comida2);
        arregloCantidadPedidosComida.add(2);
        arregloMenuComida.add(comida3);
        arregloCantidadPedidosComida.add(1);
    }
    
    public void crearProductosBebida() {
        Bebida bebida1 = new Bebida(1, "Jugo", "Naranja", (byte) 30, 600, 15);
        Bebida bebida2 = new Bebida(2, "Cafe", "Americano", (byte) 25, 300, 26);
        Bebida bebida3 = new Bebida(3, "Licuado", "Fresa", (byte) 40, 750, 12);
        arregloMenuBebida.add(bebida1);
        arregloCantidadPedidosBebida.add(3);
        arregloMenuBebida.add(bebida2);
        arregloCantidadPedidosBebida.add(2);
        arregloMenuBebida.add(bebida3);
        arregloCantidadPedidosBebida.add(1);
    }
    
    public void mostrarProductosComida() {
        for (int i = 0; i < arregloMenuComida.size(); i++) {
            arregloMenuComida.get(i).mostrarDatosComida();
        }
    }
    
    public void mostrarProductosBebida() {
        for (int i = 0; i < arregloMenuBebida.size(); i++) {
            arregloMenuBebida.get(i).mostrarDatosBebida();
        }
    }
    
    public void registrarPedidoCliente() {
        LocalDateTime fechax = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH/mm");
        String fecha = fechax.format(formatoFecha);
        String hora = fechax.format(formatoHora);
        Pedido objPedido = null;
        short idCliente = 0;
        short idEmpleado = 0;
        String nombreCliente = null;
        String nombreEmpleado = null;
        Cliente ObjetoCliente = null;
        Empleado ObjetoEmpleado = null;
        byte totalComida = 0;
        byte totalBebidas = 0;
        double totalPagarComida = 0;
        double totalPagarBebida = 0;
        double totalPagar = 0;
        byte numeroComida = 0;
        byte numeroBebida = 0;
        byte numeroPedidoActual;
        ArrayList<Comida> productosPedidosComida = new ArrayList<>();
        ArrayList<Integer> productosCantidadPedidosComida = new ArrayList<>();
        ArrayList<Bebida> productosPedidosBebida = new ArrayList<>();
        ArrayList<Integer> productosCantidadPedidosBebida = new ArrayList<>();
        
        System.out.println("----Empleados registrados----");
        this.mostrarObjetosEmpleados();
        System.out.print("Indica el empleado que esta en el mostrador: ");
        idEmpleado = teclado.nextShort();
        for (int i = 0; i < arregloEmpleados.size(); i++) {
            if (arregloEmpleados.get(i).getIdEmpleado() == idEmpleado) {
                ObjetoEmpleado = arregloEmpleados.get(i);
                break;
            }
        }
        
        
        System.out.println("----Clientes registrados----");
        this.mostrarObjetosClientes();
        System.out.print("Indica que cliente hara el pedido: ");
        idCliente = teclado.nextShort();
        for (int i = 0; i < arregloClientes.size(); i++) {
            if (arregloClientes.get(i).getIdCliente() == idCliente) {
                ObjetoCliente = arregloClientes.get(i);
                break;
            }
        }
        
        
        
        System.out.println("Objeto cliente: "+ObjetoCliente.getNombre());
        System.out.println("Objeto Empleado: "+ObjetoEmpleado.getNombre());
        nombreCliente = ObjetoCliente.getNombre();
        nombreEmpleado = ObjetoEmpleado.getNombre();
        //Se crea el objeto pedido
        objPedido = new Pedido();
        objPedido.setIdPedido(numPedido);
        objPedido.setFecha(fecha);
        objPedido.setHora(hora);
        objPedido.setIdCliente(ObjetoCliente);
        arregloPedidos.add(objPedido);
        
        //Se determina al numero de pedido
        numeroPedidoActual = (byte) ((byte) arregloPedidos.size() - 1);
        System.out.println("numero de pedido: " + numeroPedidoActual);
        System.out.println("----Menu Comida----");
        
        mostrarProductosComida();
        System.out.println("¿Cuantos productos quieres incluir?");
        totalComida = teclado.nextByte();
        for (int i = 0; i < totalComida; i++) {
            System.out.print("Ingresa el ID del producto que quieres añadir: ");
            numeroComida = teclado.nextByte();
            totalPagarComida = arregloMenuComida.get(numeroComida-1).getPrecio();
            totalPagar += totalPagarComida;
            System.out.println("Precio actual del pedido: "+totalPagar);
            arregloMenuComida.get(numeroComida-1).setStock(arregloMenuComida.get(numeroComida-1).getStock() - 1);
            productosPedidosComida.add(arregloMenuComida.get(numeroComida-1));
        }
        System.out.println("----Menu Bebida----");
        mostrarProductosBebida();
        System.out.println("¿Cuantos productos quieres incluir?");
        totalBebidas = teclado.nextByte();
        for (int i = 0; i < totalBebidas; i++) {
            System.out.println("Ingresa el ID del producto que quieres añadir: ");
            numeroBebida = teclado.nextByte();
            totalPagarBebida = arregloMenuBebida.get(numeroBebida-1).getPrecio();
            totalPagar += totalPagarBebida;
            System.out.println("Precio actual del pedido: "+totalPagar);
            arregloMenuBebida.get(numeroBebida-1).setStock(arregloMenuBebida.get(numeroBebida-1).getStock() - 1);
            productosPedidosBebida.add(arregloMenuBebida.get(numeroBebida-1));
        }
        if (ObjetoCliente.isTieneBeca()) {
            double descuento = ObjetoCliente.getPorcentaje() * 0.01;
            totalPagar = totalPagar * descuento;
            System.out.println("Total del pago con descuento: "+totalPagar);
        }
        
        //Registrar venta
        numVenta = numVenta + 1;
        Venta venta = new Venta(numVenta, idEmpleado, nombreEmpleado, idCliente, nombreCliente, productosPedidosComida, productosPedidosBebida, totalPagar, fecha, hora);
        arregloVentas.add(venta);
        System.out.println("Venta realizada.");
    }
    
    public void mostrarVentas() {
        for (int i = 0; i < arregloVentas.size(); i++) {
            arregloVentas.get(i).mostrarDatosVenta();
        }
        
    }
    
    
    
}
