package practica1.ejercicio1;

public class Ventanilla {

    private static final Ventanilla instance = new Ventanilla();
    private static int dinero;
    private static Cajero cajero;

    private Ventanilla() {}

    public static Ventanilla getInstance() {
        return instance;
    }

    public void setCajero (Cajero cajero) {
        this.cajero = cajero;
    }

    public void getDinero() {
        System.out.println("Hay " + dinero + "bs en la ventanilla");
    }

    public void cobrar(Estudiante estudiante, int monto) {
        dinero += monto;
        System.out.println("\n Pago realizado por " + estudiante.name);
        getDinero();
    }

}
