
public class main {
    public static void main(String[] args) {
        CentroMensajeria centro = new CentroMensajeria();

        SistemaSeguridad sistema = new SistemaSeguridad(centro);

        sistema.enviarAlerta(
                "Se detectó un acceso no autorizado.",
                1
        );

        sistema.enviarAlerta(
                "La puerta principal quedó abierta.",
                2
        );
    }
}