import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos al cine");

        // Cliente Uno

        Cliente clienteUno = new Cliente();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su cédula:");
        String cedula = scan.nextLine();
        System.out.println("Ingrese su nombre:");
        String nombre = scan.nextLine();
        // scan.close();

        clienteUno.setCedula(cedula);
        clienteUno.setNombre(nombre);
        clienteUno.setId(1);
        float precio = clienteUno.calcularPrecio(8000);
        System.out.println("Cédula: " + clienteUno.getCedula()
                            + "\nNombre: " + clienteUno.getNombre()
                            + "\nID: " + clienteUno.getId()
                            + "\nPrecio entrada: " + precio);

        clienteUno.mostrarDatos();
        clienteUno.saludar();
        clienteUno.saludar("Buenos días");

        // Cliente Dos

        ClientePremium clienteDos = new ClientePremium();

        clienteDos.setCedula("1165871");
        clienteDos.setNombre("José");
        clienteDos.setNumeroTarjeta(100);
        float precioDos = clienteDos.calcularPrecio(8000);

        System.out.println();

        System.out.println("Cédula: " + clienteDos.getCedula()
                            + "\nNombre: " + clienteDos.getNombre()
                            + "\nNúmero tarjeta: " + clienteDos.getNumeroTarjeta()
                            + "\nPrecio entrada: " + precioDos);
        clienteDos.mostrarDatos();

        System.out.println();
        System.out.println("- - Lista de clientes - -");

        // Pruebas contenedores
        Prueba pruebaContenedor = new Prueba();
        // pruebaContenedor.generarLista();


        // Listas de objetos
        String opcion = "S";
        while (opcion.equalsIgnoreCase("S")) { // Ignora mayúsculas
            System.out.println("Ingrese su cédula:");
            cedula = scan.next(); // Uso de next
            scan.nextLine();
            System.out.println("Ingrese su nombre:");
            nombre = scan.nextLine();
            System.out.println("Ingrese su ID:");
            int id = scan.nextInt();
            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setId(id);
            pruebaContenedor.agregarCliente(nuevoCliente);
            System.out.println("Desea agregar otro cliente? (s / n):");
            opcion = scan.next();
            scan.nextLine();
        }
        pruebaContenedor.mostrarNombreClientes();

    }

}
