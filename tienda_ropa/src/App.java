public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("MI TIENDA DE ROPA");

        Producto productoUno = new Producto();

        productoUno.setNombre("Camisa");
        productoUno.setPrecio(65000.0);

        productoUno.mostrar();

    }
}
