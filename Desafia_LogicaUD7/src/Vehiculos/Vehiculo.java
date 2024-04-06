package Vehiculos;

public abstract class Vehiculo {

    private String marca_Vehiculo;
    private String modelo_Vehiculo;
    private String numero_Bastidor; // 17 Digitos asignado por el fabricante
    private int numero_Puertas_Vehiculo;

    public static int CantidadVehículosFuncionando = 0;

    public Vehiculo() {

        CantidadVehículosFuncionando++;
    }

    public Vehiculo(String marca, String modelo, String numeroBas, int numero_Puertas) {

        marca_Vehiculo = marca;
        modelo_Vehiculo = modelo;
        numero_Bastidor = numeroBas;
        numero_Puertas_Vehiculo = numero_Puertas;

        CantidadVehículosFuncionando++;

    }

    public String toString() {
        return "Marca: " + getMarca_Vehiculo() + "Modelo: " + getModelo_Vehiculo() + "NBastidor: "
                + getNumero_Bastidor() + "Npuertas: " + getNumero_Puertas_Vehiculo();
    }

    public String getMarca_Vehiculo() {
        return marca_Vehiculo;
    }

    public String getModelo_Vehiculo() {
        return modelo_Vehiculo;
    }

    public String getNumero_Bastidor() {
        return numero_Bastidor;
    }

    public int getNumero_Puertas_Vehiculo() {
        return numero_Puertas_Vehiculo;
    }

    public static int getCantidadVehículosFuncionando() {
        return CantidadVehículosFuncionando;
    }

    public void setMarca_Vehiculo(String marca_Vehiculo) {
        this.marca_Vehiculo = marca_Vehiculo;
    }

    public void setModelo_Vehiculo(String modelo_Vehiculo) {
        this.modelo_Vehiculo = modelo_Vehiculo;
    }

    public void setNumero_Bastidor(String numero_Bastidor) {
        this.numero_Bastidor = numero_Bastidor;
    }

    public void setNumero_Puertas_Vehiculo(int numero_Puertas_Vehiculo) {
        this.numero_Puertas_Vehiculo = numero_Puertas_Vehiculo;
    }

    public static void setCantidadVehículosFuncionando(int cantidadVehículosFuncionando) {
        CantidadVehículosFuncionando = cantidadVehículosFuncionando;
    }

}
