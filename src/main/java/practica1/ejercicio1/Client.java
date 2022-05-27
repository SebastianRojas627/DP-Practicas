package practica1.ejercicio1;

public class Client {

    public static void main(String[] args) {
        Estudiante p1 = new Estudiante("Eduardo Vargas");
        Estudiante p2 = new Estudiante("Diego Deheza");
        Estudiante p3 = new Estudiante("Jorge Salinas");
        Estudiante p4 = new Estudiante("Gabriela Antezana");
        Estudiante p5 = new Estudiante("Kamila Paz");

        p1.pagar(400);
        p2.pagar(600);
        p3.pagar(780);
        p4.pagar(945);
        p5.pagar(765);

    }
}
