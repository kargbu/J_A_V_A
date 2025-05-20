package JAVA.sesion_05.reto_01;

public class Patrulla extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

 // Constructor
 public Patrulla(String nombre, String operador) {
    super(nombre);
    this.gps = new SistemaGPS();
    this.sirena = new Sirena();
    this.operador = new Operador(operador);
 }

    // Método iniciarOperacion() en cada subclase
    public void iniciarOperacion() {
        activarUnidad();     // Método heredado de UnidadEmergencia
        gps.localizar();     // Composición: utiliza SistemaGPS
        sirena.activarSirena(); // Composición: utiliza Sirena
        operador.reportarse();  // Composición: utiliza Operador
        responder();         // Implementación propia de la subclase
    }

    //Sobreescribir el método
    @Override
    public void activarUnidad() {
        System.out.println(nombre + "Patrulla en ruta para su destino.");
    }


    // Implementación de responder() (propia de cada subclase)
    @Override
    public void responder() {
        System.out.println(nombre + " en camino al hospital más cercano.");
    }
}
