package JAVA.sesion_05.reto_01;

public abstract class UnidadEmergencia {
    protected String nombreUnidad;

    // Constructor
    public UnidadEmergencia(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    // Método abstracto
    public abstract void responder();

    // Método concreto
    public void activarUnidad() {
    System.out.println("Actividad de emergencia: " + nombreUnidad);

    }
}
