public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos al cine");

        // Cliente Uno

        Cliente clienteUno = new Cliente();

        clienteUno.setCedula("11101545");
        clienteUno.setNombre("Maria");
        clienteUno.setId(1);
        float precio = clienteUno.calcularPrecio(8000);
        System.out.println("Cédula: " + clienteUno.getCedula()
                            + "\nNombre: " + clienteUno.getNombre()
                            + "\nID: " + clienteUno.getId()
                            + "\nPrecio entrada: " + precio);

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
    }
}
