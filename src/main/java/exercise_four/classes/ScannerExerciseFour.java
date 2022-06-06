package exercise_four.classes;

import exercise_four.abstracts.ScannerAbstract;
/**
 * Clase ScannerExerciseFour
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */
public class ScannerExerciseFour extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseFour
     * @return una intancia de la clase
     */
    public static ScannerExerciseFour getInstance(){return new ScannerExerciseFour();}
    /**
     * Método getDouble
     * Permite leer un valor ingresado por teclado mediante el método implementado en la clase heredada
     * Realiza el manejo de excepciones para controlar el valor ingresado
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    @Override
    public Double getDouble(){
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new ExceptionExerciseFour(exception.getMessage(), exception);
        }
    }
}
