public class ComprobantePrestamo {

    private Libro libro;
    private Socio socio;

    public ComprobantePrestamo(Libro libro, Socio socio) {
        this.libro = libro;
        this.socio = socio;
    }

    public Libro getLibro() {
        return libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public void mostrarComprobante() {
        System.out.println("===== COMPROBANTE DE PRESTAMO =====");
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Socio: " + socio.getNombre());
        System.out.println("Numero de socio: " + socio.getNumDeSocio());
        System.out.println("===================================");
    }
}