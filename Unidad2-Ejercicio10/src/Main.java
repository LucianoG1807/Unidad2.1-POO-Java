public class Main {

    public static void main(String[] args) {

        Vuelo vuelo = new Vuelo("AR123");

        Asiento asiento1 = new Asiento("12A", "Economica");
        Asiento asiento2 = new Asiento("12B", "Economica");
        Asiento asiento3 = new Asiento("1A", "Ejecutiva");

        vuelo.agregarAsiento(asiento1);
        vuelo.agregarAsiento(asiento2);
        vuelo.agregarAsiento(asiento3);

        Pasajero pasajero = new Pasajero("Lucho", "Rio de Janeiro", 123456);

        pasajero.solicitarReserva(vuelo, "12A");
        System.out.println(" ");
        pasajero.solicitarReserva(vuelo, "12A");
        System.out.println(" ");
        pasajero.solicitarReserva(vuelo, "99Z");
    }
}