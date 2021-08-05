import vista.Menu;
import conexion.SqliteConnection;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("MI TIENDA DE ROPA");

        SqliteConnection conexionBD = new SqliteConnection();
        Menu menuPrincipal = new Menu();
        menuPrincipal.generarMenu(conexionBD);

        // Ejemplo productos //
        /* ResultSet resultado = conexionBD.ejecutarConsulta("SELECT * FROM Productos");
        while (resultado.next()) {
            String codiBarras = resultado.getString("codigoBarras");
            String nombre = resultado.getString("nombre");
            float precio = resultado.getFloat("precio");

            System.out.println(codiBarras + " " + nombre + " $" + precio);
        } */

        // Producto productoUno = new Producto();
        // productoUno.setNombre("Camisa");
        // productoUno.setPrecio(65000.0);
        // productoUno.mostrar();
    }
}
