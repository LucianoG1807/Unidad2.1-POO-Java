public class main {

    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "Harry Potter and the Deathly Hallows",
                "J.K. Rowling.",
                "Disponible"
        );

        Socio socio1 = new Socio("Lucho", 101);

        Biblioteca biblioteca = new Biblioteca();

        ComprobantePrestamo comprobante = biblioteca.prestarLibro(libro1, socio1);
        comprobante.mostrarComprobante();
        ComprobantePrestamo comprobante2 = biblioteca.prestarLibro(libro1, socio1);
        comprobante2.mostrarComprobante();
    }
}