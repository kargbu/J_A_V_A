package JAVA.sesion_05.ejemplo_02;
// Hereda de Vehiculo y usa composición
public class AutoAutonomo extends Vehiculo {
    SensorGPS gps;
    Camara camara;
    SistemaIA ia;
    Motor motor;

    public AutoAutonomo(String marca) {
        super(marca);
        this.gps = new SensorGPS();
        this.camara = new Camara();
        this.ia = new SistemaIA();
        this.motor = new Motor();
    }

    public void iniciarAutonomia() {
        System.out.println("🤖 Modo autónomo activado.");
        gps.localizar();
        camara.detectarObstaculos();
        ia.tomarDecision();
        motor.arrancar();
    }
}
