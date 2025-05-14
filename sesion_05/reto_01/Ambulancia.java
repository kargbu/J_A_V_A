package JAVA.sesion_05.reto_01;

public class Ambulancia extends UnidadEmergencia{
    //Sobreescribir el método

    @Override
    void activarUnidad() {
        System.out.println(nombre + "Ambulancia en ruta para su destino.")
    }
}
