package practica1.ejercicio6;

public class Como extends Operation{

    public Como(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")) {
            context.output = context.output + "Given ";
            context.input = context.input.substring(this.digit);
        }
    }
}
