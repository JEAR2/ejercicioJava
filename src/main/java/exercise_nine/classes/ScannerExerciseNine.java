package exercise_nine.classes;

import exercise_nine.abstracts.ScannerAbstract;
/**
 * Clase ScannerExerciseNine
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
 */
public class ScannerExerciseNine extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseNine
     * @return una intancia de la clase
     */
    public static ScannerExerciseNine getInstance(){return new ScannerExerciseNine();}

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
            throw new ExceptionExerciseNine(exception.getMessage(), exception);
        }
    }
}
