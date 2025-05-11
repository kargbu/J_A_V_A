package JAVA.sesion_05.ejemplo_02;

public class Simulador {
    public static void main (String [] args) {
        AutoAutonomo tesla = new AutoAutonomo("Tesla");
        tesla.encender();          // Método heredado de Vehiculo
        tesla.iniciarAutonomia();  // Método propio con composición
    }
    Vehiculo miAuto = new Vehiculo("Toyota");
        miAuto.encender();  // Se llama al método

    
}
