public class ClientePremium extends Persona implements Tiquete {

    private int numeroTarjeta;

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    @Override
    public float calcularPrecio(float precioBase) {
        float precioFinal = (float)(precioBase - (precioBase * 0.5));
        return precioFinal;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cedula = " + this.cedula
                            + " Nombre = " + this.nombre
                            + " Número tarjeta = " + this.numeroTarjeta);
    }

}
