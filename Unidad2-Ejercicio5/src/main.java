public class main {
    static void main(String[] args) {
        DispositivoInteligente foco = new DispositivoInteligente("Foco", "Encendido", true);

        DispositivoInteligente aire = new DispositivoInteligente("Aire", "Encendido", true);

        DispositivoInteligente persiana = new DispositivoInteligente("Persiana", "Encendida", false);

        HubCentral hub = new HubCentral();

        hub.agregarDispositivo(foco);
        hub.agregarDispositivo(aire);
        hub.agregarDispositivo(persiana);

        hub.activarModoNoche();
    }
}
