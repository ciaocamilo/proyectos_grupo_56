public class Persona {

    protected String cedula;
    protected String nombre;

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void mostrarDatos() {
        System.out.println("Cedula = " + this.cedula + " Nombre = "
                            + this.nombre);
    }

    public void saludar() {
        System.out.println("Hola " + this.nombre);
    }

    public void saludar(String saludo) {
        System.out.println(saludo + " " + this.nombre);
    }

}