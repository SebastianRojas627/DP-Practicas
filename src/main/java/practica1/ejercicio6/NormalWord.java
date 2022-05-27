package practica1.ejercicio6;

public class NormalWord extends Operation {

    public NormalWord(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {

        context.output = context.output + context.input.substring(0, this.digit) + " ";
        context.input = context.input.substring(this.digit);

    }
}
