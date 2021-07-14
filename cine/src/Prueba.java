import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    private ArrayList<Cliente> listaClientes;

    public Prueba() {
        listaClientes = new ArrayList<>();
    }

    public void generarLista() {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner scan2 = new Scanner(System.in);
        int numero = 0;
        while (numero >= 0) {
            System.out.println("Ingrese un número (Número negativo para salir):");
            numero = scan2.nextInt();
            if (numero >= 0) {
                listaNumeros.add(numero);
            }
        }

        // Ciclo for
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
        System.out.println();
        // for each
        listaNumeros.forEach((elemento) -> {
            System.out.println(elemento);
        });

    }

    public void agregarCliente(Cliente pCliente){
        listaClientes.add(pCliente);
    }

    public void mostrarNombreClientes() {
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i).getNombre());
        }
    }

}
