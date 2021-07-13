public class Cliente extends Persona implements Tiquete {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public float calcularPrecio(float precioBase) {
        float precioFinal = precioBase - 1000;
        return precioFinal;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cedula = " + this.cedula
                            + " Nombre = " + this.nombre
                            + " ID = " + this.id);
    }

}
