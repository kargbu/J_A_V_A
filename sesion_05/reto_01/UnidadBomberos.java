package JAVA.sesion_05.reto_01;

public class UnidadBomberos extends UnidadEmergencia{
    //Sobreescribir el método

    @Override
    void activarUnidad() {
        System.out.println(nombre + "Camión de bomberos en ruta para su destino.")
    }
}
