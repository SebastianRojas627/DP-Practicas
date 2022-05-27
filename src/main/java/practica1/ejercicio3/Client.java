package practica1.ejercicio3;

public class Client {

    public static void main(String[] args) {
        KitColegial c1 = new CreatorKitColegial().createProduct();
        KitColegial c2 = new CreatorKitColegial().createProduct();

        KitEscolar e1 = new CreatorKitEscolar().createProduct();
        KitEscolar e2 = new CreatorKitEscolar().createProduct();

        c1.showInfo();
        c2.showInfo();
        e1.showInfo();
        e2.showInfo();
    }
}
