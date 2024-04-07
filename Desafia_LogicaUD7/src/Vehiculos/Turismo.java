package Vehiculos;

//Importo el enum como dicta el ejemplo del ejercicio.
import Vehiculos.Asientos;

abstract class Turismo extends Vehiculo {

    // Inicio una variable del enum solicitado en el ejercicio.

    private Asientos tipoAsiento;

    public Turismo(String marca, String modelo, String numeroBas, int numero_Puertas, Asientos tipoAsiento) {
        super(marca, modelo, numeroBas, numero_Puertas);

        this.tipoAsiento = tipoAsiento;
    }

    // Declaro los metodos abstractos para declararlos en las clases que
    // correspondan.

    public abstract double calcularPrecioAlquiler(int nunumeroDias);

    public abstract int getMaxVelocidad();

    // Sobreescribo el metodo toString.

    public String toString() {

        return super.toString() + "Tipo de asiento: " + getTipoAsiento();
    }

    public Asientos getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(Asientos tipo) {

        this.tipoAsiento = tipo;
    }

}
