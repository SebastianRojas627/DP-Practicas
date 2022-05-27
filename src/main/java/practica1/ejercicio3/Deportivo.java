package practica1.ejercicio3;

public class Deportivo {

    public int talla;
    public int nroPrendas;
    public String color;

    public Deportivo(int talla, int nroPrendas, String color) {
        this.nroPrendas = nroPrendas;
        this.talla = talla;
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNroPrendas() {
        return nroPrendas;
    }

    public void setNroPrendas(int nroPrendas) {
        this.nroPrendas = nroPrendas;
    }
}
