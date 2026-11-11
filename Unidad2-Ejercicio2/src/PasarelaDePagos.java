public class PasarelaDePagos {

    boolean procesarPago(double monto, Tarjeta tarjeta){
        if (monto > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
