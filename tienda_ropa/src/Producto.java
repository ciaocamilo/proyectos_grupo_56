public class Producto {

    private String nombre = "";
    private Double precio = 0.0;

    public Producto() {

    }

    public void mostrar() {
        System.out.println(nombre + ": " + precio);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

}
