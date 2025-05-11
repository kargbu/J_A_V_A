import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del paciente desde la consola
        System.out.print("Introduce el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce la edad del paciente: ");
        int edad = scanner.nextInt();

        System.out.print("Introduce el número de expediente: ");
        scanner.nextLine(); // Consumir la línea en blanco
        String numeroExpediente = scanner.nextLine();

        // Crear un objeto de tipo Paciente con los datos ingresados
        Paciente paciente = new Paciente(nombre, edad, numeroExpediente);

        // Llamar al método mostrarInformacion()
        paciente.mostrarInformacion();

        // Cerrar el Scanner
        scanner.close();
    }
}
