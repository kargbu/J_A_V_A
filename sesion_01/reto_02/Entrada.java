public class Entrada {
// Atributos de la clase
    private String nombre_evento;
    private double precio_entrada;

// Constructor que recibe los valores anteriores al crear un objeto
public Entrada (String nombre_evento, double precio_entrada) {
    this.nombre_evento = nombre_evento;
    this.precio_entrada = precio_entrada;

}

// Método público para mostrar la información de la Entrada
public void mostrar_info () {
    System.out.println("El evento es: " + nombre_evento + " Precio: $ " + precio_entrada);
}

    
}
