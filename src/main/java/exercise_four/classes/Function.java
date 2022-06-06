package exercise_four.classes;

import exercise_four.interfaces.IExerciseFour;
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
public class Function implements IExerciseFour {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance() {
        return new Function();
    }

    /**
     * Método calculatePrice
     * Permite calcular el precio de un producto aplicando un iva del 21% al valor del producto
     * @param price valor ingresado por el usuario
     * @return precio del producto incluido el iva
     */
    @Override
    public double calculatePrice(double price) {
        double iva = 0.21;
        return price + price * iva;
    }
}
