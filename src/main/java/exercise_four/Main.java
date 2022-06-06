package exercise_four;

import exercise_four.classes.Function;
import exercise_four.classes.MessagesFunction;
import exercise_four.classes.ScannerExerciseFour;


public class Main {
    static Function function = Function.getInstance();
    static ScannerExerciseFour scannerExerciseFour = ScannerExerciseFour.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public static void main(String[] args) {
        init();
    }

    private static void init(){
        messagesFunction.showWelcome();
        double price;
        double result;
        messagesFunction.getPrice();
        price=scannerExerciseFour.getDouble();
        result = function.calculatePrice(price);
        messagesFunction.showPriceIva(result);
    }
}
