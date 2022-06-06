package exercise_ten;

import exercise_ten.classes.MessagesFunction;
import exercise_ten.classes.ScannerExerciseTen;
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
     * Crea una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction  = MessagesFunction.getInstance();
    /**
     * Crea una instancia de la clase ScannerExerciseTen
     */
    static ScannerExerciseTen scannerExerciseTen = ScannerExerciseTen.getInstance();
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
        String newPhrase;
        messagesFunction.getPhraseUser();
        phrase = scannerExerciseTen.getString();
        newPhrase = phrase.replace(" ","");
        messagesFunction.showPhrase(newPhrase);
    }
}

