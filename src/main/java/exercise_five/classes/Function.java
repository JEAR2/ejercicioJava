package exercise_five.classes;

import exercise_five.interfaces.IExerciseFive;
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
public class Function implements IExerciseFive {
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
    static  MessagesFunction messagesFunction = MessagesFunction.getInstance();

    /**
     * Método viewEvenNumbers
     * Permite al usuario visualizar los valores pares del 1 al 100 mediante un ciclo while
     */
    public void viewEvenNumbers() {
        int number = 1;
        messagesFunction.showEvenNumbers();
        while (number <= 100) {
            if (number % 2 == 0) {
                messagesFunction.showNumber(number);
            }
            number++;
        }
    }

    /**
     * Método viewOddNumbers
     * Permite al usuario visualizar los valores impares del 1 al 100 mediante un ciclo while
     */
    public void viewOddNumbers() {
        int number = 1;
        messagesFunction.showOddNumbers();
        while (number <= 100) {
            if (number % 2 != 0) {
                messagesFunction.showNumber(number);
            }
            number++;
        }
    }
}
