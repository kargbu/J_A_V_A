package sesion_02.reto_01;
//Pedir al usuario los datos del medicaménto

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        // Utiliza el constructor de la clase Scanner y pasa System.in como argumento para leer la entrada del teclado.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del medicamento: ");
        String nombre = scanner.nextLine(); // Lee una línea de texto

        System.out.print("Ingresa el precio unitario: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingresa la cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        // Calcula el total sin descuento
        double total = precio * cantidad;

        // Aplica el descuento
        double descuento = total > 500 ? total * 0.15 : 0.0;

        // Calcular a pagar
        double total_a_pagar = total - descuento;


        // Imprime el resultado
        System.out.println("\nResumen de compra");
        System.out.println("Medicamento: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total_a_pagar);
        scanner.close();
    }
}
