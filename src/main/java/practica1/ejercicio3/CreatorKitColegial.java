package practica1.ejercicio3;

public class CreatorKitColegial extends Creator{

    @Override
    public KitColegial createProduct() {
        Mochila mochila = new Mochila(6, "mediano");
        Libro libro = new Libro("texto", "O. Mendoza");
        Computadora computadora = new Computadora("Acer", "windows");

        KitColegial product = new KitColegial();
        product.setComputadora(computadora);
        product.setLibro(libro);
        product.setMochila(mochila);

        return product;
    }
}
