package JAVA.sesion_05.reto_01;

public class Patrulla extends UnidadEmergencia{
    //Sobreescribir el método

    @Override
    void activarUnidad() {
        System.out.println(nombre + "Patrulla en ruta para su destino.")
    }
}
