package practica1.ejercicio5;

public class Owner {

    private BuilderPlatos builder;

    public Plato getPlatoHecho() {
        return builder.getPlato();
    }

    public void setBuilder(BuilderPlatos builder) {
        this.builder = builder;
    }

    public void armarPlato() {
        this.builder.definePlato();
        this.builder.defineTipoCarne();
        this.builder.defineSaborRefresco();
        this.builder.defineGuarniciones();
    }
}
