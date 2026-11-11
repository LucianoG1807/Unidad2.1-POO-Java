import java.util.ArrayList;

public class HubCentral {

    private ArrayList<DispositivoInteligente> dispositivos = new ArrayList<>();

    public void agregarDispositivo(DispositivoInteligente dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void activarModoNoche() {
        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo.estaConectado()) {
                dispositivo.apagar();
                System.out.println(
                        dispositivo.getDispositivo() + ": apagado."
                );
            } else {
                System.out.println(
                        dispositivo.getDispositivo() + ": desconectado, no se pudo apagar."
                );
            }
        }
    }

}