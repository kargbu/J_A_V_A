package JAVA.sesion_05.reto_01;

abstract class UnidadEmergencia {
    String nombre;

    //método abstracto
    abstract void responder();

    //Método concreto
    void activarUnidad() {
    System.out.println("Mensaje");

    }
}
