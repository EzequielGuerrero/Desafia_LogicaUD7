package Vehiculos;

public class Particular extends Turismo implements Iniciable {

    private String propietario;
    private boolean conAireAcondiconado;

    public Particular(String marca, String modelo, String numeroBas, int numero_Puertas, Asientos tipoAsiento,
            String propietario, boolean conAireAcondiconado) {
        super(marca, modelo, numeroBas, numero_Puertas, tipoAsiento);

        this.propietario = propietario;
        this.conAireAcondiconado = conAireAcondiconado;
    }

    @Override
    public double calcularPrecioAlquiler(int nunumeroDias) {

        return nunumeroDias = nunumeroDias * 30;
    }

    @Override
    public int getMaxVelocidad() {

        return 220;
    }

    @Override
    public void reiniciarContador(double kilometros) {

        // El parametro que recibe es el KM inicial del viaje.

        System.out.println("El Particular tiene acumulados un total de " + kilometros + "kilometros");

    }

}
