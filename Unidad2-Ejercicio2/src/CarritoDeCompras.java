public class CarritoDeCompras {

    PasarelaDePagos pasarela = new PasarelaDePagos();

    int a = 100;
    int b = 150;
    double total = a + b;

    void Comprar () {
        boolean resultado = pasarela.procesarPago(total, new Tarjeta("Lucho" , 1234)) ;

        if (resultado) {
            System.out.println("Compra exitosa!");
        }
        else {
            System.out.println("Saldo insuficiente...");
        }
    }
}
