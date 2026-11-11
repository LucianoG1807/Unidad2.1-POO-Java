public class main {
    static void main(String[] args) {

        Personaje personaje1 = new Personaje(
                "Iron Main", 100, 25);

        Personaje personaje2 = new Personaje(
                "Spider Man", 100, 15);

        personaje1.atacar(personaje2);
        System.out.println(" ");
        personaje2.atacar(personaje1);
        System.out.println(" ");
        personaje1.atacar(personaje2);
        System.out.println(" ");
        personaje1.atacar(personaje2);
        System.out.println(" ");
        personaje1.atacar(personaje2);
        System.out.println(" ");
        personaje1.atacar(personaje2);
        System.out.println(" ");
        personaje2.atacar(personaje1);
    }

}
