package practica1.ejercicio1;

public class Cajero {

    public String name;
    public int codigo;

    public Cajero(String name, int codigo) {
        this.name = name;
        this.codigo = codigo;
    }

    public void openVentanilla() {
        Ventanilla.getInstance().setCajero(this);
        System.out.println("Ventanilla abierta por: " + name + " con codigo: " + codigo);
    }
}
