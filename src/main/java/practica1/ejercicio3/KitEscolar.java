package practica1.ejercicio3;

public class KitEscolar implements IKit{

    public Mochila mochila;
    public Deportivo deportivo;
    public Cuaderno cuaderno;

    public KitEscolar() {
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void showInfo() {
        System.out.println("\n *** KIT ESCOLAR ***");
        System.out.println("Mochila con " + this.mochila.nroBolsillos + " numero de bolsillos y de tamaño " + this.mochila.size);
        System.out.println("Deportivo de talla " + this.deportivo.talla + ", de color " + this.deportivo.color + " y " + this.deportivo.nroPrendas + " prendas");
        System.out.println("Cuadernos de tipo " + this.cuaderno.tipo + " de " + this.cuaderno.nroHojas + " hojas");
    }
}
