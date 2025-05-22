public class Principal {
    public static void main(String[] args) {
        // Crear objetos de la clase Entrada
        Entrada entrada1 = new Entrada("Concierto de Rock", 850.50);
        Entrada entrada2 = new Entrada("Obra de Teatro", 450.00);

        // Llamar al método mostrarInformacion() para imprimir datos
        entrada1.mostrar_info();
        entrada2.mostrar_info();

        // Reto adicional
        Entrada_record entrada3 = new Entrada_record("Sinfónica de BEDU", 1200.00);
        entrada3.mostrar_info();
    }
}
