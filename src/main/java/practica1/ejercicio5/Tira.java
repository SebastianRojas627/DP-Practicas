package practica1.ejercicio5;

public class Tira extends BuilderPlatos {

    @Override
    public void definePlato() {
        System.out.println("\n PLATO TIRA");
    }

    @Override
    public void defineTipoCarne() {
        System.out.println("tira de carne");
    }

    @Override
    public void defineSaborRefresco() {
        System.out.println("cocacola");
    }

    @Override
    public void defineGuarniciones() {
        System.out.println("fideo");
    }
}
