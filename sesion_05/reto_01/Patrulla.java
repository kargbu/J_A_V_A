package JAVA.sesion_05.reto_01;

public class Patrulla extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;






    //Sobreescribir el método
    @Override
    void activarUnidad() {
        System.out.println(nombre + "Patrulla en ruta para su destino.")
    }


    // Implementación de responder() (propia de cada subclase)
    @Override
    public void responder() {
        System.out.println(nombre + " en camino al hospital más cercano.");
    }
}
