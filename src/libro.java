class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String categoria;
    private int anio;
    private int cantidadEjemplares;

    // Constructor vacío
    public Libro() {
        this.titulo = "Sin titulo";
        this.autor = "Anónimo";
        this.categoria = "General";
        this.anio = 2024;
        this.cantidadEjemplares = 0;
    }

    // Constructor con parámetros
    public Libro(int cantidadEjemplares, String autor, String categoria, String titulo, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anio = anio;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setAnio(int anio) { this.anio = anio; }

    // Métodos
    public String mostrarInformacion() {
        String aux = "";
        aux += "Titulo: " + titulo + "\n";
        aux += "Autor: " + autor + "\n";
        aux += "Categoria: " + categoria + "\n";
        aux += "Año: " + anio + "\n";
        aux += "Cantidad: " + cantidadEjemplares + " ejemplar(es) \n";
        return aux;
    }

    public int prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            return cantidadEjemplares;
        }
        return -1; // No hay ejemplares
    }

    // Devolver un libro
    public void devolver() {
        cantidadEjemplares++;
    }
}