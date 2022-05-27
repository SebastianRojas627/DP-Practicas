package practica1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Operation{

    private List<Operation> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter) {
        context = new Context(msgToInterpreter.replace(" ",""));
        for (String word : msgToInterpreter.split(" ")){
            switch (word) {
                case "Como":
                    grammar.add(new Como(word.length()));
                    break;
                case "Quiero":
                    grammar.add(new Quiero(word.length()));
                    break;
                case "Para":
                    grammar.add(new Para(word.length()));
                    break;
                default:
                    grammar.add(new NormalWord(word.length()));
                    break;
            }
        }
    }

    public String evaluateMsg() {
        for (Operation expression : grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
