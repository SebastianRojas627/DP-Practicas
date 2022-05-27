package practica1.ejercicio1;

public class Estudiante {

    public String name;

    public Estudiante(String name) {
        this.name = name;
    }

    public void pagar(int monto) {
        Ventanilla.getInstance().cobrar(this, monto);
    }
}
