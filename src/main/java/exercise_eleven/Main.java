package exercise_eleven;

import exercise_eleven.classes.MessagesFunction;
import exercise_eleven.classes.ScannerExerciseEleven;


public class Main {
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    static ScannerExerciseEleven scannerExerciseEleven = ScannerExerciseEleven.getInstance();
    public static void main(String[] args) {
        init();
    }
    public static void init(){
        messagesFunction.showWelcome();
        String phrase;
        String phraseLower;
        int number;
        messagesFunction.getPhraseUser();
        phrase = scannerExerciseEleven.getString();
        messagesFunction.showLengthPhrase(phrase.length());
        phraseLower = phrase.toLowerCase();
        number = phraseLower.replaceAll("[^aeiou]","").length();
        messagesFunction.showVowels(number);
        messagesFunction.showPhrase(phrase);



    }
}
