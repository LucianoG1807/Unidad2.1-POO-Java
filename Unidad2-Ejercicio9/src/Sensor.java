import java.util.Random;

public class Sensor {

    private String nombreSensor;
    private double temperatura;
    private double humedad;

    public Sensor (String nombreSensor) {
        this.nombreSensor = nombreSensor;
    }

    public String getNombreSensor() {
        return nombreSensor;
    }

    public double getHumedad() {
        return humedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void obtenerLectura() {

        Random random = new Random();

        temperatura = 10 + random.nextDouble() * 30;
        humedad = random.nextDouble() * 100;

        System.out.println("=== LECTURA DEL SENSOR ===");
        System.out.println("=== ------------------ ===");
        System.out.println("=== Sensor: " + nombreSensor);

        System.out.printf("=== Temperatura: %.2f °C\"%n", temperatura);
        System.out.printf("=== Humedad: %.2f%% =======%n", humedad);

        System.out.println("==========================");

    }
}
