package JAVA.sesion_05.reto_01;

public class Ambulancia extends UnidadEmergencia{
 private SistemaGPS gps;
 private Sirena sirena;
 private Operador operador;

 // Constructor
 public Ambulancia(String nombre, Operador operador) {
    super(nombre);
    this.gps = new SistemaGPS();
    this.sirena = new Sirena();
    this.operador = operador;
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
        System.out.println(nombre + "Ambulancia en ruta para su destino.");
    }


    // Implementación de responder() (propia de cada subclase)
    @Override
    public void responder() {
        System.out.println(nombre + " en camino al hospital más cercano.");
    }
}
