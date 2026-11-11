import java.util.ArrayList;

public class Pedido {

    private int numMesa;
    private ArrayList<Plato> platos;

    public Pedido (int numMesa) {
        this.numMesa = numMesa;
        this.platos = new ArrayList<>();
    }

    public int getNumMesa() {
        return numMesa;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }
}
