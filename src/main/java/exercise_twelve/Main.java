package exercise_twelve;

import exercise_twelve.classes.MessagesFunction;
import exercise_twelve.classes.ScannerExerciseTwelve;

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
     * Crea una instancia de la clase ScannerExerciseTwelve
     */
    static ScannerExerciseTwelve scannerExerciseTwelve = ScannerExerciseTwelve.getInstance();

    public static void main(String[] args) {
        init();

    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
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
