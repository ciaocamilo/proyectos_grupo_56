package vista;

import modelo.*;
import javax.swing.JOptionPane;
import conexion.SqliteConnection;
import controlador.controladorCliente;

public class Menu {

    public void generarMenu(SqliteConnection conexionBD) {
        String textoMenu = "Elija su opción: \n" +
                           "1. Crear Cliente \n" +
                           "2. Listar diez primeros clientes \n" +
                           "3. Listar productos comprados por cliente";
        String opcionElegida = JOptionPane.showInputDialog(null, textoMenu, "Menú principal", JOptionPane.QUESTION_MESSAGE);

        controladorCliente ctrlCliente = new controladorCliente();

        switch (opcionElegida) {
            case "1":
                    String ident = JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                    String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);

                    Cliente nuevoCliente = new Cliente(ident, nombre, apellido);
                    ctrlCliente.crearCliente(nuevoCliente, conexionBD);
                    break;
            case "2":
                    String clientes = ctrlCliente.listarClientes(conexionBD);
                    JOptionPane.showMessageDialog(null, clientes, "Listado de clientes", JOptionPane.INFORMATION_MESSAGE);
                    break;
            case "3":
                    String identCliente = JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente a buscar:", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                    String productos = ctrlCliente.listarProductosCliente(identCliente, conexionBD);
                    JOptionPane.showMessageDialog(null, productos, "Listado de productos comprados por cliente", JOptionPane.INFORMATION_MESSAGE);
                    break;
        }

    }

}
