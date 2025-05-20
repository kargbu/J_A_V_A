package JAVA.sesion_05.reto_01;

public class CentralEmergencia {
    public static void main(String[] args) {
        Operador operadorJuan = new Operador("Juan");
        Ambulancia ambulancia = new Ambulancia("Ambulancia",operadorJuan );
        Patrulla patrulla = new Patrulla("Patrulla", operadorJuan);
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", operadorJuan);
    
        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
    


}
