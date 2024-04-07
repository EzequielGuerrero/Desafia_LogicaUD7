package Vehiculos;

public interface Iniciable {

    // No especifico que es un metodo abstracto, al no ser necesario debido a que
    // todos los metodos declarados en una interface son explicitamente abstractos.
    // Igualmente no es necesario poner public por su propia naturaleza.

    public void reiniciarContador(double kilometros);

}