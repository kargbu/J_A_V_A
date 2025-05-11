package JAVA.sesion_05.ejemplo_03;

// Es una clase abstracta porque comparte atributos y métodos
public abstract class Drone {
    String id;
    
    // Constructor
    public Drone(String id) {
        this.id = id;
    }

    //Método que compartirá
    public void despegar() {
        System.out.println("🚁 Drone " + id + " despegando...");
    }
    public void aterrizar() {
        System.out.println("🛬 Drone " + id + " aterrizando...");
    }

    // Método abstracto que cada tipo de drone debe implementar
    public abstract void ejecutarMision();
}
