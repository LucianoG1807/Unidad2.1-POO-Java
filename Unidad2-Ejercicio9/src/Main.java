public class Main {
    static void main(String[] args) {

        EstacionMeteorologica estacionMendoza = new EstacionMeteorologica(
                "Estacion meteorologica Pedro Maza",
                123
        );

        Sensor zonaEste = new Sensor("Zona Este");
        Sensor valleDeUco = new Sensor("Valle de Uco");
        Sensor ciudad = new Sensor("Ciudad de Mendoza");

        estacionMendoza.agregarSensor(zonaEste);
        estacionMendoza.agregarSensor(valleDeUco);
        estacionMendoza.agregarSensor(ciudad);

        estacionMendoza.generarReporteClimatico();
    }
}
