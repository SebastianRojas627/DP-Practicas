package practica1.ejercicio5;

public class Lomito extends BuilderPlatos{

    @Override
    public void definePlato() {
        System.out.println("\n PLATO LOMITO");
    }

    @Override
    public void defineTipoCarne() {
        System.out.println("lomo");
    }

    @Override
    public void defineSaborRefresco() {
        System.out.println("pepsi");
    }

    @Override
    public void defineGuarniciones() {
        System.out.println("arroz");
    }
}
