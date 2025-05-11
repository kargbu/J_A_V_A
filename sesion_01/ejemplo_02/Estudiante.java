// Una clase es una plantilla que describe las características (atributos) y comportamientos (métodos) que puede tener un objeto.

public class Estudiante {
    //Características del estudiante
    String nombre;
    int edad;
    // Método que muestra un saludo con los datos del estudiante
    public void saludar() {
        System.out.println("¡Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}