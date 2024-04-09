package Vehiculos;

public class Particular extends Turismo implements Iniciable {

    private String propietario;
    private boolean conAireAcondiconado;

    // Añado kmRecorridos como campo de clase.
    private double kmRecorridos = 0;

    public Particular(String marca, String modelo, String numeroBas, int numero_Puertas, Asientos tipoAsiento,
            double kmRecorridos, String propietario, boolean conAireAcondiconado) {
        super(marca, modelo, numeroBas, numero_Puertas, tipoAsiento);

        this.kmRecorridos = kmRecorridos;
        this.propietario = propietario;
        this.conAireAcondiconado = conAireAcondiconado;

    }

    public String toString() {
        return super.toString() + ", KMrecorridos:" + getKmRecorridos() + ", Propietario:" + getPropietario()
                + ", Aire acondicionado: " + getConAireAcondiconado();
    }

    private double getKmRecorridos() {

        return kmRecorridos;
    }

    @Override
    public double calcularPrecioAlquiler(int nunumeroDias) {

        return nunumeroDias = nunumeroDias * 30;
    }

    @Override
    public int getMaxVelocidad() {

        return 220;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean getConAireAcondiconado() {
        return conAireAcondiconado;
    }

    public void setConAireAcondiconado(boolean conAireAcondiconado) {
        this.conAireAcondiconado = conAireAcondiconado;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    @Override
    public void reiniciarContador(double kilometros) {

        setKmRecorridos(kilometros);

        System.out.println("El Particular lleva recorridos: " + kilometros + " Kilometros");
    }

}
