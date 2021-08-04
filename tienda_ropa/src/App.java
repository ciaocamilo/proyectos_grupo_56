import modelo.*;

// import java.sql.ResultSet;
import javax.swing.*;
import conexion.SqliteConnection;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("MI TIENDA DE ROPA");

        SqliteConnection conexionBD = new SqliteConnection();

        // Ejemplo productos //
     /* ResultSet resultado = conexionBD.ejecutarConsulta("SELECT * FROM Productos");
        while (resultado.next()) {
            String codiBarras = resultado.getString("codigoBarras");
            String nombre = resultado.getString("nombre");
            float precio = resultado.getFloat("precio");

            System.out.println(codiBarras + " " + nombre + " $" + precio);
        } */

        String ident = JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);

        Cliente nuevoCliente = new Cliente(ident, nombre, apellido);

        ClienteDAO cli1 = new ClienteDAO();
        cli1.insertarCliente(nuevoCliente, conexionBD);

        String clientes = cli1.mostrarClientes(conexionBD);

        JOptionPane.showMessageDialog(null, clientes, "Listado de clientes", JOptionPane.INFORMATION_MESSAGE);

        // Producto productoUno = new Producto();
        // productoUno.setNombre("Camisa");
        // productoUno.setPrecio(65000.0);
        // productoUno.mostrar();
    }
}
