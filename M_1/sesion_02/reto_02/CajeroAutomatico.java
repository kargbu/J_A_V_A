package sesion_02.reto_02;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo_inicial = 1000.0;
        boolean salir = false;

        while(!salir) {
            System.out.println("=== Bienvenido al cajero ===");
            System.out.println("1. Consultar saldo ");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");

            int opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Tu saldo es $" + saldo_inicial);
                    break;
                case 2:
                    System.out.println("Ingresa el monto a depositar: ");
                    double saldo = scanner.nextDoble();
                    if (saldo > 0) {
                        saldo = saldo_inicial + saldo;
                        System.out.println("Has depositado $" + saldo);

                    } else {
                        System.out.println("El monto debe ser positivo")
                    }

            }


        }
        
    }
    
}
