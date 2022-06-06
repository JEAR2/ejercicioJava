package exercise_nine;

import exercise_nine.classes.Function;
import exercise_nine.classes.MessagesFunction;
import exercise_nine.classes.ScannerExerciseNine;


public class Main {
    static Function function = Function.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    static ScannerExerciseNine scannerExerciseNine = ScannerExerciseNine.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        messagesFunction.showWelcome();
        String phrase = messagesFunction.getPhrase();
        String phraseTwo;
        String result;
        result = function.change(phrase);
        messagesFunction.getPhraseUser();
        phraseTwo = scannerExerciseNine.getString();
        result = result.concat(phraseTwo);
        messagesFunction.showPhrase(result);
    }
}
