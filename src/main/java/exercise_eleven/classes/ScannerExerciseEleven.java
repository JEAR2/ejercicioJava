package exercise_eleven.classes;

import exercise_eleven.abstracts.ScannerAbstract;

/**
 * Clase ScannerExerciseEleven
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
 */
public class ScannerExerciseEleven extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseNine
     * @return una intancia de la clase
     */
    public static ScannerExerciseEleven getInstance(){return new ScannerExerciseEleven();}

    /**
     * Método getString
     * Permite leer un valor ingresado por teclado y quita los saltos de linea que haya podido ingresar el usuario
     * @return lectura del valor ingresado para su posterior almacenamiento
     */
    @Override
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptionExerciseEleven(exception.getMessage(), exception);
        }
    }
}
