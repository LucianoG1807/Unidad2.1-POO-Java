public class main {
    static void main(String[] args) {

        Cocina jimboComidas = new Cocina();
        Mozo lucho = new Mozo();

        Plato canelones = new Plato("Canelones con salsa", 6000, 15);
        Plato carneOlla = new Plato("Carne a la olla con pure", 6500, 30);


        Pedido pedido1 = new Pedido(8);
        pedido1.agregarPlato(canelones);
        pedido1.agregarPlato(carneOlla);

        lucho.enviarPedidoACocina(pedido1, jimboComidas);

        jimboComidas.mostrarPendientes();




    }
}
