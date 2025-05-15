package JAVA.sesion_05.reto_01;

public abstract class UnidadEmergencia {
    protected String nombre;

    // Constructor
    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract void responder();

    // Método concreto
    public void activarUnidad() {
    System.out.println("Actividad de emergencia." + nombre);

    }
}
