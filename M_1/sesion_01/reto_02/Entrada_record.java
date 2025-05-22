public record Entrada_record (String nombre_evento, double precio_entrada) {
    // Puedes incluir métodos adicionales si es necesario, pero el constructor ya está implícito.
    
    // Método público para mostrar la información
    public void mostrar_info() {
        System.out.println("El evento es: " + nombre_evento + " | Precio: $" + precio_entrada);
    }
}
