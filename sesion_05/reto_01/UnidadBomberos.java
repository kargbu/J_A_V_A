package JAVA.sesion_05.reto_01;

public class UnidadBomberos extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;
    
    //Sobreescribir el método
    @Override
    void activarUnidad() {
        System.out.println(nombre + "Camión de bomberos en ruta para su destino.")
    }
}
