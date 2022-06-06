package exercise_nine;

import exercise_nine.classes.Function;
import exercise_nine.classes.MessagesFunction;
import exercise_nine.classes.ScannerExerciseNine;
/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
 */

public class Main {
    /**
     * Crea una instancia de la clase Function
     */
    static Function function = Function.getInstance();
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    /**
     * Crea una instancia de la clase ScannerExerciseNine
     */
    static ScannerExerciseNine scannerExerciseNine = ScannerExerciseNine.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
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
