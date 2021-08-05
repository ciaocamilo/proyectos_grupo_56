package vista;

import modelo.*;
import javax.swing.JOptionPane;
import conexion.SqliteConnection;

public class Menu {

    public void generarMenu(SqliteConnection conexionBD) {
        String textoMenu = "Elija su opción: \n" +
                           "1. Crear Cliente \n" +
                           "2. Listar diez primeros clientes \n" +
                           "3. Listar productos comprados por cliente";
        String opcionElegida = JOptionPane.showInputDialog(null, textoMenu, "Menú principal", JOptionPane.QUESTION_MESSAGE);

        ClienteDAO cli1 = new ClienteDAO();
        switch (opcionElegida) {
            case "1":
                    String ident = JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                    String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);

                    Cliente nuevoCliente = new Cliente(ident, nombre, apellido);

                    cli1.insertarCliente(nuevoCliente, conexionBD);
            case "2":
                    String clientes = cli1.mostrarClientes(conexionBD);
                    JOptionPane.showMessageDialog(null, clientes, "Listado de clientes", JOptionPane.INFORMATION_MESSAGE);
            case "3":

        }

    }

}
