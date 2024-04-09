package Vehiculos;

public class Autobus extends Vehiculo {

    private int numero_Bus;
    private int numero_Paradas;

    // Constructor sin parametros

    public Autobus() {

    }

    // En el siguiente constructor hago la llamada al constructor con parametros de
    // la clase padre Vehiculos.

    public Autobus(String marca, String modelo, String numeroBas, int numero_Puertas, int numero_Bus,
            int numero_Paradas) {

        super(marca, modelo, numeroBas, numero_Puertas);

        this.numero_Bus = numero_Bus;
        this.numero_Paradas = numero_Paradas;

    }

    // Sobreescribo el metodo toString llamando al metodo de la clase padre y
    // sumandole lo necesario para que muestre la informacion del nuevo constructor

    public String toString() {

        return super.toString() + ", Numero de Autobus:" + getNumero_Bus() + ", NParadas:" + getNumero_Paradas();
    }

    // A continuacion se declaran los getters y setters correspondientes.

    public int getNumero_Bus() {
        return numero_Bus;
    }

    public void setNumero_Bus(int numero_Bus) {
        this.numero_Bus = numero_Bus;
    }

    public int getNumero_Paradas() {
        return numero_Paradas;
    }

    public void setNumero_Paradas(int numero_Paradas) {
        this.numero_Paradas = numero_Paradas;
    }

}
