package exercise_fourteen;

import exercise_fourteen.classes.Function;
import exercise_fourteen.classes.MessageFunction;
import exercise_fourteen.classes.ScannerExerciseFourteen;


public class Main {
    static MessageFunction messageFunction = MessageFunction.getInstance();
    static Function function = Function.getInstance();
    static ScannerExerciseFourteen scannerExerciseFourteen = ScannerExerciseFourteen.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        messageFunction.showWelcome();
        int number;
        messageFunction.getNumber();
        number = scannerExerciseFourteen.getInteger();
        function.loopValues(number);
    }
}
