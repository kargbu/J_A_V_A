public class Vehiculo {
    String marca; // Atributo de clase

    // Constructor que se ejecuta cunado se crea un nuvo objeto de tipo Vehiculo
    public Vehiculo (String marca) {
        this.marca = marca;
    }
    // Método encender
    public void encender () {
        System.out.println("🔑 El vehículo " + marca + " está encendido.");
    }
}