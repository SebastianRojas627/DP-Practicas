package practica1.ejercicio6;

public class Quiero extends Operation{

    public Quiero(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")) {
            context.output = context.output + "When ";
            context.input = context.input.substring(this.digit);
        }
    }
}
