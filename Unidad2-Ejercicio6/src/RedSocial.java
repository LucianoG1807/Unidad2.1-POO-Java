public class RedSocial {

    public void enviarSolicitud (Usuario remitente, Usuario receptor) {
        receptor.recibirNotificacion("Tenes una nueva solicitud de amistad.");
    }
}
