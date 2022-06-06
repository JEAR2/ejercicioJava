package exercise_nine.classes;

import exercise_nine.interfaces.IExerciseNine;
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
public class Function implements IExerciseNine {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance(){return new Function();}

    /**
     * Método change(String phrase)
     * Permite reemplazar la letra 'a' por la letra 'e' de una frase recibida como parametro
     * @param phrase frase recibida
     * @return frase con combios realizados
     */
    public String change(String phrase) {
        return phrase.replace("a", "e");

    }
}
