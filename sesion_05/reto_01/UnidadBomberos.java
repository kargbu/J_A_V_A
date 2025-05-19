package JAVA.sesion_05.reto_01;

public class UnidadBomberos extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public UnidadBomberos(String nombre, String operador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operador);
    }
    
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
    }

    //Sobreescribir el método
    @Override
    public void activarUnidad() {
        System.out.println(nombre + "Camión de bomberos en ruta para su destino.");
    }
    @Override
    public void responder() {
        System.out.println(nombre + "Unidad de bomberos respondiendo a incendio estructural");
    }
}
 
    