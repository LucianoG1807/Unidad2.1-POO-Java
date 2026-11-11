import java.util.ArrayList;

public class Cocina {

    ArrayList<Pedido> pendientes = new ArrayList<>() ;

    public void recibirComanda (Pedido pedido) {
        pendientes.add(pedido);
    }

    public void mostrarPendientes() {
        System.out.println("Mesas pendientes:");
        for (Pedido pedido : pendientes) {
            System.out.println(pedido.getNumMesa());
        }
    }
}
