package exercise_fourteen.classes;

import exercise_fourteen.abstracts.ScannerAbstract;
/**
 * Clase ScannerExerciseFourteen
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class ScannerExerciseFourteen extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseNine
     * @return una intancia de la clase
     */
    public static ScannerExerciseFourteen getInstance(){
        return new ScannerExerciseFourteen();
    }

    /**
     * Método getInteger
     * Permite leer un valor ingresado por teclado mediante el metodo implementado en la clase heredada
     * Realiza el manejo de excepciones para controlar el valor ingresado
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    @Override
    public Integer getInteger(){
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptionExerciseFourteen(exception.getMessage(), exception);
        }
    }
}
