package J A V A.sesion_04.ejemplo_04;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Valeria");
        empleado.setEdad(29);
        empleado.mostrarInfo();

        // Contrato inmutable
        Contrato c = new Contrato("Tiempo completo", 25000.00);
        c.mostrarInfo();
    }
}
