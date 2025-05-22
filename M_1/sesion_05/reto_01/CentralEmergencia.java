package JAVA.sesion_05.reto_01;

public class CentralEmergencia {
    public static void main(String[] args) {
        Operador operadorJuan = new Operador("Juan");
        Ambulancia ambulancia = new Ambulancia("Ambulancia 0",operadorJuan );
        Patrulla patrulla = new Patrulla("Patrulla 007", operadorJuan);
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos B4", operadorJuan);
    
        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
    


}
