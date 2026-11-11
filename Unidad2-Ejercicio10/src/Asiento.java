public class Asiento {

    private String numeroAsiento;
    private String claseVuelo;
    private boolean ocupado;

    public Asiento (String numeroVuelo, String claseVuelo){
        this.numeroAsiento = numeroVuelo;
        this.claseVuelo = claseVuelo;
        this.ocupado = false;
    }

    public String getClaseVuelo() {
        return claseVuelo;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void ocupar() {
        ocupado = true;
    }
}
