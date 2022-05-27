package practica1.ejercicio4;

public class Estudiante {

    public int ci;
    public String name;

    public Estudiante(String name, int ci) {
        this.name = name;
        this.ci = ci;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
