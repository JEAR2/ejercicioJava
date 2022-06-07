package exercise_sixteen.classes;

import exercise_sixteen.abstracts.ScannerAbstract;

/**
 * Clase ScannerExerciseSixteen
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-05/06/22
 */
public class ScannerExerciseSixteen extends ScannerAbstract {

    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseSixteen
     * @return una intancia de la clase
     */
    public static ScannerExerciseSixteen getInstance() {
        return new ScannerExerciseSixteen();
    }

    /**
     * Método getInteger
     * Permite leer un valor ingresado por teclado mediante el metodo implementado en la clase heredada
     * Realiza el manejo de excepciones para controlar el valor ingresado
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    @Override
    public Integer getInteger() {
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptionExerciseSixteen(exception.getMessage(), exception);
        }
    }

    /**
     * Método getDouble
     * Permite leer un valor ingresado por teclado mediante el metodo implementado en la clase heredada
     * Realiza el manejo de excepciones para controlar el valor ingresado
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    @Override
    public Double getDouble() {
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new ExceptionExerciseSixteen(exception.getMessage(), exception);
        }
    }

    /**
     * Método getString
     * Permite leer un valor ingresado por teclado y quita los saltos de linea que haya podido ingresar el usuario
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptionExerciseSixteen(exception.getMessage(), exception);
        }
    }
}
