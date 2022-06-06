package exercise_three.classes;


import exercise_three.abstracts.ScannerAbstract;
/**
 * Clase ScannerExerciseThree
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */
public class ScannerExerciseThree extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseTwo
     * @return una intancia de la clase
     */
    public static ScannerExerciseThree getInstance(){
        return new ScannerExerciseThree();
    }
    /**
     * Método getDouble
     * Permite leer un valor ingresado por teclado mediante el metodo implementado en la clase heredada
     * Realiza el manejo de excepciones para controlar el valor ingresado
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    @Override
    public Double getDouble(){
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new ExceptionExerciseThree(exception.getMessage(), exception);
        }
    }


}
