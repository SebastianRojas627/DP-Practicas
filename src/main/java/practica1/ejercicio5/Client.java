package practica1.ejercicio5;

public class Client {

    public static void main(String[] args) {

        BuilderPlatos bife = new Bife();
        BuilderPlatos lomo = new Lomito();
        BuilderPlatos tira = new Tira();

        Owner chef = new Owner();

        chef.setBuilder(bife);
        chef.armarPlato();
        chef.getPlatoHecho();

        chef.setBuilder(lomo);
        chef.armarPlato();
        chef.getPlatoHecho();

        chef.setBuilder(tira);
        chef.armarPlato();
        chef.getPlatoHecho();

    }
}
