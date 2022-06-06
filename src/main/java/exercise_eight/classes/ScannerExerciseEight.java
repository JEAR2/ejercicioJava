package exercise_eight.classes;


import exercise_eight.abstracts.ScannerAbstract;
/**
 * Clase ScannerExerciseEight
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
 */
public class ScannerExerciseEight extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseSeven
     * @return una intancia de la clase
     */
    public static ScannerExerciseEight getInstance(){return new ScannerExerciseEight();}

    /**
     * Método getInteger
     * Permite leer un valor ingresado por teclado mediante el método implementado en la clase heredada
     * Realiza el manejo de excepciones para controlar el valor ingresado
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    @Override
    public Integer getInteger(){
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptionExerciseEight(exception.getMessage(), exception);
        }
    }
}
