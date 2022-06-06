package exercise_two.classes;

import exercise_two.interfaces.IExerciseTwo;
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
public class Function implements IExerciseTwo {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance() {
        return new Function();
    }
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    MessagesFunction messagesFunction = MessagesFunction.getInstance();
    /**
     * Método compare
     * Este método permite obtener el mayor de dos valores ingresados como parametros
     * @param numberOne primer valor a comparar
     * @param numberTwo segundo valor a cmparar
     */
    @Override
    public void compare(Integer numberOne, Integer numberTwo) {

        if (numberOne > numberTwo) {
            messagesFunction.showBiggerNumber(numberOne);
        } else if (numberTwo > numberOne) {
            messagesFunction.showBiggerNumber(numberTwo);
        } else {
            messagesFunction.showEqualNumber();
        }
    }
}
