public class main {
    static void main(String[] args) {


        Usuario usuario1 = new Usuario("Lucho");
        Usuario usuario2 = new Usuario("Fiamma");

        RedSocial redSocial = new RedSocial();

        redSocial.enviarSolicitud(usuario1, usuario2);

        System.out.println(usuario2.getNotificaciones());


    }
}
