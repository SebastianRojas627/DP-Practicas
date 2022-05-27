package practica1.ejercicio4;

public class FactoryMateria {

    public static Materia make(TypeMateria type) {
        Materia materia;
        switch (type) {
            case MATEMATICA:
                materia = new Matematicas("Matematicas");
                break;
            case LENGUAJE:
                materia = new Lenguaje("Lenguaje");
                break;
            case HISTORIA:
                materia = new Historia("Historia");
                break;
            default:
                materia = new Ingles("Ingles");
                break;
        }

        return materia;
    }

}