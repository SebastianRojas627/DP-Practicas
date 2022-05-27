package practica1.ejercicio5;

public abstract class BuilderPlatos {

    protected Plato plato;

    public BuilderPlatos() {}

    public Plato getPlato() {
        return plato;
    }

    public void createPlato() {
        this.plato = new Plato();
    }

    public abstract void definePlato();
    public abstract void defineTipoCarne();
    public abstract void defineSaborRefresco();
    public abstract void defineGuarniciones();

}
