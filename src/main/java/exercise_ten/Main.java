package exercise_ten;

import exercise_ten.classes.MessagesFunction;
import exercise_ten.classes.ScannerExerciseTen;


public class Main {
    static MessagesFunction messagesFunction  = MessagesFunction.getInstance();
    static ScannerExerciseTen scannerExerciseTen = ScannerExerciseTen.getInstance();
    public static void main(String[] args) {
        init();
    }

    public static void init(){
        messagesFunction.showWelcome();
        String phrase;
        String newPhrase;
        messagesFunction.getPhraseUser();
        phrase = scannerExerciseTen.getString();
        newPhrase = phrase.replace(" ","");
        messagesFunction.showPhrase(newPhrase);
    }
}

