public class Mensaje {

    /*
    1 — El Centro de Notificaciones

Contexto En una aplicación de gestión empresarial, los distintos módulos del sistema
necesitan informar eventos importantes a los usuarios (como alertas de seguridad o avisos de pago).
Para lograr esto de manera desacoplada, los objetos emisores deben enviar mensajes a un objeto centralizador
de notificaciones que se encarga de procesarlas y entregarlas.

Consigna Diseñar un sistema en Java donde un objeto emisor (por ejemplo, una clase SistemaSeguridad) se
comunique con un objeto receptor (CentroMensajeria) enviándole mensajes a través de invocaciones a métodos,
pasando parámetros complejos.

Desarrollo requerido

Definir la clase Mensaje con atributos como remitente, texto y prioridad.

Crear la clase CentroMensajeria que contenga un método recibirMensaje(Mensaje m) para procesar las comunicaciones entrantes.

Implementar la clase SistemaSeguridad que posea una referencia a un CentroMensajeria y un
método que dispare el envío de una alerta.

En el método main, instanciar el centro, el sistema de seguridad, simular el envío de al
menos dos mensajes y mostrar el estado de la comunicación por consola.
     */
        private String remitente;
        private String texto;
        private int prioridad;

        // constructor
        public Mensaje(String remitente, String texto, int prioridad) {
            this.remitente = remitente;
            this.texto = texto;
            this.prioridad = prioridad;
        }

        public String getRemitente() {
            return remitente;
        }

        public String getTexto() {
            return texto;
        }

        public int getPrioridad() {
            return prioridad;
        }
    }
