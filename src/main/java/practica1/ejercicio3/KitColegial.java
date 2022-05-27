package practica1.ejercicio3;

public class KitColegial implements IKit{

    public Mochila mochila;
    public Libro libro;
    public Computadora computadora;

    public KitColegial() {
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("\n *** KIT COLEGIAL ***");
        System.out.println("Mochila con " + this.mochila.nroBolsillos + " numero de bolsillos y de tamaño " + this.mochila.size);
        System.out.println("Libros de tipo " + this.libro.tipo + ", del autor " + this.libro.autor);
        System.out.println("Computadora de marca " + this.computadora.marca + " del os " + this.computadora.os);
    }
}
