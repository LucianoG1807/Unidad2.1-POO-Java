public class Mozo {

    public void enviarPedidoACocina (Pedido pedido, Cocina cocina) {
        cocina.recibirComanda(pedido);
        System.out.println("Comanda enviada con exito.");
    }
}
