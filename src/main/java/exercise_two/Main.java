package exercise_two;


import exercise_two.classes.Function;
import exercise_two.classes.MessagesFunction;
import exercise_two.classes.ScannerExerciseTwo;

public class Main {
    static Function function = Function.getInstance();
    static ScannerExerciseTwo scannerExerciseTwo = ScannerExerciseTwo.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();


    public static void main(String[] args) {
        init();
    }

    private static void init(){
        messagesFunction.showWelcome();
        int numberOne;
        int numberTwo;
        messagesFunction.getNumberOne();
        numberOne= scannerExerciseTwo.getInteger();
        messagesFunction.getNumberTwo();
        numberTwo= scannerExerciseTwo.getInteger();
        function.compare(numberOne,numberTwo);
    }
}
