import java.util.ArrayList;
import java.util.List;

abstract class MaterialBiblioteca {
    protected String titulo;
    protected String codigo;
    protected boolean disponibilidad;

    public MaterialBiblioteca(String titulo, String codigo, boolean disponibilidad) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponibilidad = disponibilidad;
    }

    public MaterialBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponibilidad = true;
    }

    public abstract void mostrarInformacion();
    public abstract int calcularDiasPrestamo();
}

class Libro extends MaterialBiblioteca {
    private String autor;

    public Libro(String titulo, String codigo, String autor, boolean disponibilidad) {
        super(titulo, codigo, disponibilidad);
        this.autor = autor;
    }

    public Libro(String titulo, String codigo, String autor) {
        super(titulo, codigo);
        this.autor = autor;
    }

    @Override
    public void mostrarInformacion() {
        String estado = disponibilidad ? "Disponible" : "Prestado";
        System.out.println("[Libro] Título: " + titulo + " | Autor: " + autor + " | Código: " + codigo + " | Estado: " + estado);
    }

    @Override
    public int calcularDiasPrestamo() {
        return 7;
    }
}

class Revista extends MaterialBiblioteca {
    private int numeroEdicion;

    public Revista(String titulo, String codigo, int numeroEdicion, boolean disponibilidad) {
        super(titulo, codigo, disponibilidad);
        this.numeroEdicion = numeroEdicion;
    }

    public Revista(String titulo, String codigo, int numeroEdicion) {
        super(titulo, codigo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        String estado = disponibilidad ? "Disponible" : "Prestado";
        System.out.println("[Revista] Título: " + titulo + " | Edición: " + numeroEdicion + " | Código: " + codigo + " | Estado: " + estado);
    }

    @Override
    public int calcularDiasPrestamo() {
        return 3;
    }
}

public class mensaje {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El nombre de la rosa", "L-001", "Umberto Eco");
        Libro libro2 = new Libro("Ficciones", "L-002", "Jorge Luis Borges");
        Revista revista1 = new Revista("National Geographic", "R-001", 205);
        Revista revista2 = new Revista("Science", "R-002", 5890);

        List<MaterialBiblioteca> coleccionBiblioteca = new ArrayList<>();
        coleccionBiblioteca.add(libro1);
        coleccionBiblioteca.add(libro2);
        coleccionBiblioteca.add(revista1);
        coleccionBiblioteca.add(revista2);

        for (MaterialBiblioteca material : coleccionBiblioteca) {
            material.mostrarInformacion();
            System.out.println("Días de préstamo permitidos: " + material.calcularDiasPrestamo() + " días");
            System.out.println("--------------------------------------------------");
        }
    }
}