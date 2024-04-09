package Vehiculos;

public class Taxi extends Turismo implements Calculable, Iniciable {

    private final double IMPORTE_INICIO = 2;
    private double kmRecorridos;
    private double impoteKm;

    public Taxi(String marca, String modelo, String numeroBas, int numero_Puertas, Asientos tipoAsiento,
            double kmRecorridos, double importeKm) {
        super(marca, modelo, numeroBas, numero_Puertas, tipoAsiento);

        this.kmRecorridos = kmRecorridos;
        this.impoteKm = importeKm;

    }

    @Override
    public String toString() {
        return super.toString() + " Importe de inicio:" + getIMPORTE_INICIO() + ", Importe Km:" + getImpoteKm()
                + ", KmRecorridos:" + getKmRecorridos() + ", Coste del trayecto:" + calcularCosteTrayecto() + " Euros";

    }

    // Implemento la logica de los metodos de la interface.
    @Override
    public double calcularPrecioAlquiler(int nunumeroDias) {

        return nunumeroDias = nunumeroDias * 50;
    }

    @Override
    public int getMaxVelocidad() {

        return 200;
    }

    // Implemento la logica marcada en el ejercicio.
    @Override
    public double calcularCosteTrayecto() {

        return getIMPORTE_INICIO() + (getKmRecorridos() * getImpoteKm());
    }

    @Override
    public void reiniciarContador(double kilometros) {

        setKmRecorridos(kilometros);

        System.out.println("El Taxi lleva acumulados un total de: " + kilometros + "kilometros de recorrido.");
    }

    public double getIMPORTE_INICIO() {
        return IMPORTE_INICIO;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getImpoteKm() {
        return impoteKm;
    }

    public void setImpoteKm(double impoteKm) {
        this.impoteKm = impoteKm;
    }

}
