package exercise_three.classes;

import exercise_three.interfaces.IExerciseThree;
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
public class Function implements IExerciseThree {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance() {
        return new Function();
    }

    /**
     * Método calculateArea
     * permite calcular el area de un circulo
     * @param radius ingresado por el usuario
     * @return valor del area obtenido mediante la formula del area del circulo
     */
    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
