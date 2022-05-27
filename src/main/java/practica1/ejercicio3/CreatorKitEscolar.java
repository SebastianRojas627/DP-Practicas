package practica1.ejercicio3;

public class CreatorKitEscolar extends Creator{


    @Override
    public KitEscolar createProduct() {
        Mochila mochila = new Mochila(3, "pequeño");
        Deportivo deportivo = new Deportivo(8, 2, "rojo");
        Cuaderno cuaderno = new Cuaderno("cuadriculado", 150);

        KitEscolar product = new KitEscolar();
        product.setCuaderno(cuaderno);
        product.setDeportivo(deportivo);
        product.setMochila(mochila);

        return product;
    }
}
