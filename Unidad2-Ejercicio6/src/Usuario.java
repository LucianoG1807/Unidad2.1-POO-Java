import java.util.ArrayList;

public class Usuario {

    private String nombreUsuario;
    private ArrayList<Usuario> listaAmigos;
    private ArrayList<String> notificaciones;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.listaAmigos = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
    }

    public void recibirNotificacion(String mensaje) {
        notificaciones.add(mensaje);
    }

    public ArrayList<String> getNotificaciones() {
        return notificaciones;
    }
}


