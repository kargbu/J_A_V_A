package JAVA.M_2.sesion_01.ejemplo_01;

public class CajaMisteriosaMain {
    public static  void main(String [] args) {

        CajaMisteriosa cajita = new CajaMisteriosa();

        cajita.guardar("Hola pinche mundo");
        
        String valor = cajita.sacar(); // <--- ERROR

        System.out.println("El valor de la caja es: " + valor)
    }
    
}
