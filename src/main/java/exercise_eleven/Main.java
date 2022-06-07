package exercise_eleven;

import exercise_eleven.classes.MessagesFunction;
import exercise_eleven.classes.ScannerExerciseEleven;

/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class Main {
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    /**
     * Crea una instancia de la clase ScannerExerciseEleven
     */
    static ScannerExerciseEleven scannerExerciseEleven = ScannerExerciseEleven.getInstance();
    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
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
