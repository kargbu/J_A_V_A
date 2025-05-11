public class Paciente {
    // Atributos de la clase Paciente
    private String nombre;
    private int edad;
    private String numeroExpediente;

    // Constructor para inicializar los atributos
    public Paciente(String nombre, int edad, String numeroExpediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroExpediente = numeroExpediente;
    }

    // Método público para mostrar la información del paciente
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}