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
    }
}
