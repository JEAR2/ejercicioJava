package exercise_two;


import exercise_two.classes.Function;
import exercise_two.classes.MessagesFunction;
import exercise_two.classes.ScannerExerciseTwo;
/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */
public class Main {
    /**
     * Crea una instancia de la clase Function
     */
    static Function function = Function.getInstance();
    /**
     * Crea una instancia de la clase ScannerExerciseTwo
     */
    static ScannerExerciseTwo scannerExerciseTwo = ScannerExerciseTwo.getInstance();
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();


    public static void main(String[] args) {
        init();
    }
    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
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
