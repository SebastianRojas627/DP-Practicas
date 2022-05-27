package practica1.ejercicio6;

public class Para extends Operation{

    public Para(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")) {
            context.output = context.output + "Then ";
            context.input = context.input.substring(this.digit);
        }
    }
}
