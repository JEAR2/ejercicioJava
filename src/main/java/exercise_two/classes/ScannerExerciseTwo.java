package exercise_two.classes;

import exercise_two.abstracts.ScannerAbstract;

/**
 * Clase ScannerExerciseTwo
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */
public class ScannerExerciseTwo extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseTwo
     * @return una intancia de la clase
     */
    public static ScannerExerciseTwo getInstance(){
        return new ScannerExerciseTwo();
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
            throw new ExceptionExerciseTwo(exception.getMessage(), exception);
        }
    }


}
