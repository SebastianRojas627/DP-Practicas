package practica1.ejercicio4;

public class Client {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Diego" ,1);
        Estudiante e2 = new Estudiante("Jose" ,2);
        Estudiante e3 = new Estudiante("Ramiro" ,3);
        Estudiante e4 = new Estudiante("Jorge" ,4);
        Estudiante e5 = new Estudiante("Armando" ,5);
        Estudiante e6 = new Estudiante("Santiago" ,6);
        Estudiante e7 = new Estudiante("Mateo" ,7);
        Estudiante e8 = new Estudiante("Ignacio" ,8);
        Estudiante e9 = new Estudiante("Roberto" ,9);
        Estudiante e10 = new Estudiante("Mauricio" ,10);

        InscripcionMaterias.getInstance().inscribirEstudiante(e1, TypeMateria.MATEMATICA);
        InscripcionMaterias.getInstance().inscribirEstudiante(e1, TypeMateria.LENGUAJE);
        InscripcionMaterias.getInstance().inscribirEstudiante(e1, TypeMateria.INGLES);
        InscripcionMaterias.getInstance().inscribirEstudiante(e1, TypeMateria.HISTORIA);

        InscripcionMaterias.getInstance().inscribirEstudiante(e2, TypeMateria.MATEMATICA);
        InscripcionMaterias.getInstance().inscribirEstudiante(e2, TypeMateria.LENGUAJE);
        InscripcionMaterias.getInstance().inscribirEstudiante(e2, TypeMateria.INGLES);
        InscripcionMaterias.getInstance().inscribirEstudiante(e2, TypeMateria.HISTORIA);

        InscripcionMaterias.getInstance().inscribirEstudiante(e3, TypeMateria.MATEMATICA);
        InscripcionMaterias.getInstance().inscribirEstudiante(e3, TypeMateria.LENGUAJE);
        InscripcionMaterias.getInstance().inscribirEstudiante(e3, TypeMateria.INGLES);
        InscripcionMaterias.getInstance().inscribirEstudiante(e3, TypeMateria.HISTORIA);

        InscripcionMaterias.getInstance().inscribirEstudiante(e4, TypeMateria.MATEMATICA);
        InscripcionMaterias.getInstance().inscribirEstudiante(e4, TypeMateria.LENGUAJE);
        InscripcionMaterias.getInstance().inscribirEstudiante(e4, TypeMateria.INGLES);
        InscripcionMaterias.getInstance().inscribirEstudiante(e4, TypeMateria.HISTORIA);

        InscripcionMaterias.getInstance().inscribirEstudiante(e5, TypeMateria.MATEMATICA);
        InscripcionMaterias.getInstance().inscribirEstudiante(e5, TypeMateria.LENGUAJE);
        InscripcionMaterias.getInstance().inscribirEstudiante(e5, TypeMateria.INGLES);
        InscripcionMaterias.getInstance().inscribirEstudiante(e5, TypeMateria.HISTORIA);

    }
}
