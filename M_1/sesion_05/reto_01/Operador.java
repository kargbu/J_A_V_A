package JAVA.sesion_05.reto_01;

public class Operador {
    String nombreOperador;

    public Operador (String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }

public void reportarse() {
    System.out.println("Operador" + nombreOperador + "reportándose.");
    }
}
