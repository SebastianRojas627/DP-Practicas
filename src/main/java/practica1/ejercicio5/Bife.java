package practica1.ejercicio5;

public class Bife extends BuilderPlatos{

    @Override
    public void definePlato() {
        System.out.println("\n PLATO BIFE");
    }

    @Override
    public void defineTipoCarne() {
        System.out.println("bife");
    }

    @Override
    public void defineSaborRefresco() {
        System.out.println("cocacola");
    }

    @Override
    public void defineGuarniciones() {
        System.out.println("papas fritas");
    }
}
