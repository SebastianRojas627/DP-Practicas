package practica1.ejercicio3;

public class Mochila {

    public int nroBolsillos;
    public String size;

    public Mochila(int nroBolsillos, String size) {
        this.nroBolsillos = nroBolsillos;
        this.size = size;
    }

    public int getNroBolsillos() {
        return nroBolsillos;
    }

    public void setNroBolsillos(int nroBolsillos) {
        this.nroBolsillos = nroBolsillos;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
