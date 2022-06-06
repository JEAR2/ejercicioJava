package exercise_ten.classes;

import exercise_ten.abstracts.ScannerAbstract;

/**
 * Clase ScannerExerciseTen
 * Está clase al herredar de la clase Abstracta ScannerAbstract, permite utilizar los métodos
 * implementados en esta clase heredada y sobreescribirlos
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
 */
public class ScannerExerciseTen extends ScannerAbstract {
    /**
     * Método getIntance()
     * Crea una instancia de la clase ScannerExerciseTen
     * @return una intancia de la clase
     */
    public static ScannerExerciseTen getInstance(){return new ScannerExerciseTen();}

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
            throw new ExceptionExerciseTen(exception.getMessage(), exception);
        }
    }
}
