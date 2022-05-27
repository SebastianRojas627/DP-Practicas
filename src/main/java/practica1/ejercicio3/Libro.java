package practica1.ejercicio3;

public class Libro {

    public String tipo;
    public String autor;

    public Libro(String tipo, String autor) {
        this.autor = autor;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
