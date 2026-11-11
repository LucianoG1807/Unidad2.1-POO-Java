import java.util.ArrayList;

public class Vuelo {

    private String codigoVuelo;
    private ArrayList<Asiento> asientos;

    public Vuelo (String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
        asientos = new ArrayList<>();
    }

    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }

    public boolean reservarAsiento (String numAsiento) {

        for (Asiento asiento : asientos) {

            if (asiento.getNumeroAsiento().equals(numAsiento)) {
                if (!asiento.estaOcupado()) {
                    asiento.ocupar();
                    System.out.println("Reservado con exito.");
                    return true;
                } else {
                    System.out.println("Asiento no disponible.");
                    return false;
                }
            }
        }
        System.out.println("Asiento no encontrado.");
        return false;
    }

}
