package practica1.ejercicio3;

public class Computadora {

    public String marca;
    public String os;

    public Computadora(String marca, String os) {
        this.marca = marca;
        this.os = os;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
