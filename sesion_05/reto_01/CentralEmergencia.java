package JAVA.sesion_05.reto_01;

public class CentralEmergencia {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juan");
        Patrulla patrulla = new Patrulla("Patrulla" , "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Rita");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
    


}
