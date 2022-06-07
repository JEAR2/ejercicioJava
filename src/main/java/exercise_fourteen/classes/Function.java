package exercise_fourteen.classes;

import exercise_fourteen.interfaces.IExerciseFourteen;

/**
 * Clase Function
 * Esta clase permite crear todas las funciones o métodos para ser invocados
 * desde cualquier clase del sistema para su funcionamineto
 *
 * Autor
 * John Edward Acevedo rojas -- jhedacro@gmail.com
 *
 * Version: v1-30/05/22
 *
 */
public class Function implements IExerciseFourteen {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance(){return new Function();}

    /**
     * Se crea instancia de la clase MessageFunction
     */
    static MessageFunction messageFunction = MessageFunction.getInstance();

    /**
     * Método loopValues(int number)
     * Permite recorrer y  mostrar los valores desde un valor ingresado por el usuario hasta el valor 1000 de 2 en 2
     * @param number valor ingresado por el usuario
     */
    @Override
    public void loopValues(int number) {
        while(number<=1000){
            messageFunction.showNumber(number);
            number=number+2;
        }
    }
}
