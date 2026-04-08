public class pricipl {
    public static void main(String[] args) {

        // 1. CREACIÓN DE LOS LIBROS
        Libro L1 = new Libro(3, "Carlo Collodi", "Cuento", "Pinocho", 1881);
        Libro L2 = new Libro(); // Usa el constructor vacío

        System.out.println("Libro 1 original:\n" + L1.mostrarInformacion());

        // 2. PRUEBa
        System.out.println("Prestando Libro 1... ");
        if (L1.prestar() < 0) {
            System.out.println("No hay ejemplares\n");
        } else {
            System.out.println("Ejemplar prestado con éxito\n");
        }

        // Imprimimos para ver que ahora hay 2 ejemplares
        System.out.println("Libro 1 después de prestar:\n" + L1.mostrarInformacion());

        // 3. PRUEBA DEL MÉTODO DEVOLVER (Suma 1)
        System.out.println("Devolviendo Libro 1... ");
        L1.devolver();
        System.out.println("Ejemplar devuelto con éxito\n");

        // Imprimimos para ver que regresó a 3 ejemplares
        System.out.println("Libro 1 después de devolver:\n" + L1.mostrarInformacion());


        // 4. PRUEBA DE LOS MÉTODOS SETTERS
        L1.setTitulo("Pinocho (Edicion Especial)");
        System.out.println("Libro 1 con título modificado:\n" + L1.mostrarInformacion());

        // Invocar a los 4 métodos para darle datos reales al Libro 2
        L2.setTitulo("El Señor de los Anillos");
        L2.setAutor("J.R.R. Tolkien");
        L2.setCategoria("Fantasía");
        L2.setAnio(1954);

        System.out.println("Libro 2 modificado:\n" + L2.mostrarInformacion());
    }
}