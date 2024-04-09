package Vehiculos;

class Main_Truck {

    public static void main(String[] args) {

        System.out.println("Comenzamos!!" + "\n");

        // Creo dos objetos tipo Taxi:

        Taxi primerTaxi = new Taxi("Tesla", "XS", "JN3XYZ4E7KZ987654", 5, Asientos.CALEFACCION, 50000, 12.50);
        Taxi segundoTaxi = new Taxi("Honda", "CHR", "AB8MNP5R3QV678901", 3, Asientos.CUERO, 25000, 45.25);

        // Creo dos objetos tipo particular:

        Particular primer_Particular = new Particular("Renault", "Megan", "H7G6F5D4S3A2Q1W9", 5, Asientos.RECLINABLES,
                150000, "Antonio", true);
        Particular segundo_Particular = new Particular("Kia", "XCeed", "LKJHGFDSAPOIUYTRE", 3, Asientos.CALEFACCION,
                5000, "Maria", true);

        Autobus primerAutobus = new Autobus("Mercedes-Benz", "Sprinter", "X9W8V7U6T5S4R3Q2P", 2, 8, 23);

        System.err.println("Taxis:");

        System.out.println(primerTaxi.toString() + "\n" + segundoTaxi.toString() + "\n");

        System.out.println("Particulares:");

        System.out.println(primer_Particular.toString() + "\n" + segundo_Particular.toString() + "\n");

        System.out.println("Bus: ");

        System.out.println(primerAutobus.toString() + "\n");

        System.out.println("El total de vehiculos funcionando es: " + Vehiculo.CantidadVehículosFuncionando);

        // Reinicio el cuenta kilometros del primer taxi:
        primerTaxi.reiniciarContador(25000.00);

        // Imprimo mensaje calculando el coste del nuevo recorrido del taxi:
        System.out.println("El nuevo coste del trayecto es : " + primerTaxi.calcularCosteTrayecto() + " Euros" + "\n");

        // Imprimo la informacion completa para comprobar que los valores se actualizan
        // correctamente.
        System.out.println(primerTaxi.toString() + "\n");

        // Reinicio kilometros del primer Particular.
        primer_Particular.reiniciarContador(10000);

        // Cambio nombre del propietario del segundo Particular e imprimo valores.
        segundo_Particular.setPropietario("Patricia");

        System.out.println(segundo_Particular.toString());

    }

}