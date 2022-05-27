package practica1.ejercicio6;

public class Client {

    public static void main(String[] args) {
        String msg = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Interpreter parcer = new Interpreter(msg);
        System.out.println("msg interpretado: " + parcer.evaluateMsg());
    }
}
