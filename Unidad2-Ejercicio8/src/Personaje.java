public class Personaje {

    private String nombre;
    private int puntosVida;
    private int poderAtaque;

    Personaje (String nombre, int puntosVida, int poderAtaque) {

        this.nombre = nombre;
        this.poderAtaque = poderAtaque;
        this.puntosVida = puntosVida;

    }

    public void atacar (Personaje oponente) {

        if (poderAtaque > 0 && puntosVida > 0) {
            System.out.println(nombre + " Buen golpe!");
            oponente.recibirDanio(poderAtaque);
        }
        else {
            System.out.println("Te has quedado sin poder de ataque.");
        }

        if (puntosVida <= 0) {
            System.out.println("Game Over. Te quedaste sin vida.");
        }


    }

    public void recibirDanio (int cantidad) {

        puntosVida -= cantidad ;
        System.out.println(nombre + " eso tuvo que doler... Vida restante: " + puntosVida);
        poderAtaque --;

        if (puntosVida <= 0) {
            System.out.println("Game Over.");
        }
    }
}
