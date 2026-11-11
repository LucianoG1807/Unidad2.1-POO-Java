import java.util.ArrayList;

public class EstacionMeteorologica {

    String nombreEstacion;
    int numeroEstacion;
    ArrayList<Sensor> sensores;

    EstacionMeteorologica (String nombreEstacion, int numeroEstacion) {

        this.nombreEstacion = nombreEstacion;
        this.numeroEstacion = numeroEstacion;
        sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void generarReporteClimatico() {
        for (Sensor sensor : sensores) {
            sensor.obtenerLectura();
        }
    }
}
