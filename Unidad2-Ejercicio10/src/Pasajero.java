public class Pasajero {

    private String nombrePasajero;
    private String destino;
    private int dni;

    Pasajero (String nombrePasajero, String destino, int dni) {

        this.nombrePasajero = nombrePasajero;
        this.destino = destino;
        this.dni = dni;


    }

    public int getDni() {
        return dni;
    }

    public String getDestino() {
        return destino;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void solicitarReserva(Vuelo vuelo, String numAsiento){

        boolean reservado = vuelo.reservarAsiento(numAsiento);

        if (reservado) {
            System.out.println("=== RESERVA CONFIRMADA ===");
            System.out.println("Pasajero: " + nombrePasajero);
            System.out.println("DNI: " + dni);
            System.out.println("Asiento: " + numAsiento);
            System.out.println("Destino: " + destino);
            System.out.println("==========================");
        } else {
            System.out.println("=== RESERVA RECHAZADA ===");
            System.out.println("El asiento " + numAsiento + " no existe o ya esta ocupado.");
        }

        }

    }

