package JAVA.sesion_05.reto_01;

public class Ambulancia extends UnidadEmergencia{
 private SistemaGPS gps;
 private Sirena sirena;
 private Operador operadorAsignado;

 // Constructor
 public Ambulancia(String nombreUnidad, Operador operadorAsignado) {
    super(nombreUnidad);
    this.gps = new SistemaGPS();
    this.sirena = new Sirena();
    this.operadorAsignado = operadorAsignado;
 }

    // Método iniciarOperacion() en cada subclase
    public void iniciarOperacion() {
        activarUnidad();     // Método heredado de UnidadEmergencia
        gps.localizar();     // Composición: utiliza SistemaGPS
        sirena.activarSirena(); // Composición: utiliza Sirena
        operadorAsignado.reportarse();  // Composición: utiliza Operador
        responder();         // Implementación propia de la subclase
    }

    //Sobreescribir el método
    @Override
    public void activarUnidad() {
        System.out.println("Ambulancia en ruta para su destino." + nombreUnidad);
    }


    // Implementación de responder() (propia de cada subclase)
    @Override
    public void responder() {
        System.out.println(" En camino al hospital más cercano.");
    }
}
