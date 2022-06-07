package exercise_fourteen;

import exercise_fourteen.classes.Function;
import exercise_fourteen.classes.MessageFunction;
import exercise_fourteen.classes.ScannerExerciseFourteen;

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
     * Crea una instancia de la clase MessageFunction
     */
    static MessageFunction messageFunction = MessageFunction.getInstance();

    /**
     * Crea una instancia de la clase Function
     */
    static Function function = Function.getInstance();

    /**
     * Crea una instancia de la clase ScannerExerciseFourteen
     */
    static ScannerExerciseFourteen scannerExerciseFourteen = ScannerExerciseFourteen.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
    public static void init(){
        messageFunction.showWelcome();
        int number;
        messageFunction.getNumber();
        number = scannerExerciseFourteen.getInteger();
        function.loopValues(number);
    }
}
