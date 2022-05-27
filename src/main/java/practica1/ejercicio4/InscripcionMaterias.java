package practica1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class InscripcionMaterias {

    public static final InscripcionMaterias instance = new InscripcionMaterias();
    public FactoryMateria factory = new FactoryMateria();
    public List<Estudiante> matematica = new ArrayList<>();
    public List<Estudiante> lenguaje = new ArrayList<>();
    public List<Estudiante> historia = new ArrayList<>();
    public List<Estudiante> ingles = new ArrayList<>();

    private InscripcionMaterias() {}

    public static InscripcionMaterias getInstance() {
        return instance;
    }

    public void inscribirEstudiante(Estudiante estudiante, TypeMateria type) {
        switch (type) {
            case MATEMATICA:
                matematica.add(estudiante);
                checkIntegrantesMatematica();
            case LENGUAJE:
                lenguaje.add(estudiante);
                checkIntegrantesLenguaje();
            case HISTORIA:
                historia.add(estudiante);
                checkIntegrantesHistoria();
            default:
                ingles.add(estudiante);
                checkIntegrantesInglesa();
        }

    }

    public void checkIntegrantesMatematica() {
        if(matematica.size() == 5) {
            factory.make(TypeMateria.MATEMATICA);
        }
    }

    public void checkIntegrantesLenguaje() {
        if(lenguaje.size() == 5) {
            factory.make(TypeMateria.LENGUAJE);
        }
    }

    public void checkIntegrantesHistoria() {
        if(historia.size() == 5) {
            factory.make(TypeMateria.HISTORIA);
        }
    }

    public void checkIntegrantesInglesa() {
        if(ingles.size() == 5) {
            factory.make(TypeMateria.INGLES);
        }
    }



}
