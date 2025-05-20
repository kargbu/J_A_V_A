package JAVA.sesion_05.reto_01;

public class UnidadBomberos extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operadorAsignado;

    public UnidadBomberos(String nombreUnidad, Operador operadorAsignado) {
        super(nombreUnidad);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operadorAsignado = operadorAsignado;
    }
    
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operadorAsignado.reportarse();
        responder();
    }

    //Sobreescribir el método
    @Override
    public void activarUnidad() {
        System.out.println( "Camión de bomberos en ruta para su destino." + nombreUnidad);
    }
    @Override
    public void responder() {
        System.out.println("Unidad de bomberos respondiendo a incendio estructural");
    }
}
 
    