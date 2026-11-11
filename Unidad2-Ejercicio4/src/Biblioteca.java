public class Biblioteca {

    public ComprobantePrestamo prestarLibro(Libro libro, Socio socio) {

        if (libro.getDisponibilidad().equalsIgnoreCase("disponible")) {

            libro.setDisponibilidad("No disponible");

            System.out.println("Prestamo realizado correctamente.");

            return new ComprobantePrestamo(libro, socio);

        } else {

            System.out.println("El libro no se encuentra disponible.");

            return null;
        }
    }
}