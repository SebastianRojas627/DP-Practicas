package practica1.ejercicio3;

public class Cuaderno {

    public String tipo;
    public int nroHojas;

    public Cuaderno(String tipo, int nroHojas) {
        this.tipo = tipo;
        this.nroHojas = nroHojas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNroHojas() {
        return nroHojas;
    }

    public void setNroHojas(int nroHojas) {
        this.nroHojas = nroHojas;
    }
}
