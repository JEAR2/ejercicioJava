package exercise_twelve;

import exercise_twelve.classes.MessagesFunction;
import exercise_twelve.classes.ScannerExerciseTwelve;


public class Main {
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    static ScannerExerciseTwelve scannerExerciseTwelve = ScannerExerciseTwelve.getInstance();

    public static void main(String[] args) {
        init();

    }

    public static void init(){
        messagesFunction.showWelcome();
        String firstWord;
        String secondWord;
        boolean result;
        messagesFunction.getWordOne();
        firstWord = scannerExerciseTwelve.getString();
        messagesFunction.getWordTwo();
        secondWord = scannerExerciseTwelve.getString();
        result = firstWord.equals(secondWord);
        if(result){
            messagesFunction.showWordEquals();
        }else{
            messagesFunction.showWordNoEquals();
            messagesFunction.showWords(firstWord,secondWord);

        }
    }


}
