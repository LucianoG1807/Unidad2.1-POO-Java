public class Tarjeta {

    private String titular;
    private int numTarjeta;

    public Tarjeta (String titular, int numTarjeta) {
        this.titular = titular;
        this.numTarjeta = numTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }
}
