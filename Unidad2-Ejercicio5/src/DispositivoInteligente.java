public class DispositivoInteligente {

    private String dispositivo;
    private String estado;
    private boolean conectado;

    public DispositivoInteligente (String dispositivo, String estado, boolean conectado) {
        this.dispositivo = dispositivo;
        this.estado = estado;
        this.conectado = conectado;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public String getEstado() {
        return estado;
    }

    public void encender () {
        estado = "Encendido.";
    }

    public void apagar () {
        estado = "Apagado.";
    }

    public boolean estaConectado () {
        return conectado;
    }
    
}
