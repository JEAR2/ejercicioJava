package exercise_six.classes;

import exercise_six.interfaces.IExerciseSix;
/**
 * Clase Function
 * Esta clase permite crear todas las funciones o métodos para ser invocados
 * desde cualquier clase del sistema para su funcionamineto
 *
 * Autor
 * John Edward Acevedo rojas -- jhedacro@gmail.com
 *
 * Version: v1-29/05/22
 *
 */
public class Function implements IExerciseSix {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance() {
        return new Function();
    }
    /**
     * Cre una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    /**
     * Método viewEvenNumbers
     * Permite al usuario visualizar los valores pares del 1 al 100 mediante un ciclo for
     */
    public void viewEvenNumbers() {
        messagesFunction.showEvenNumbers();
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                messagesFunction.showNumber(number);
            }
        }
    }
    /**
     * Método viewOddNumbers
     * Permite al usuario visualizar los valores impares del 1 al 100 mediante un ciclo for
     */
    public void viewOddNumbers() {
        messagesFunction.showOddNumbers();
        for (int number = 1; number <= 100; number++) {
            if (number % 2 != 0) {
                messagesFunction.showNumber(number);
            }
        }
    }
}
