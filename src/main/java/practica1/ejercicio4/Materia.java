package practica1.ejercicio4;

public abstract class Materia {

    public String name;

    public Materia(String name) {
        this.name = name;
        System.out.println("La materia de " + name + " esta abierta");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
