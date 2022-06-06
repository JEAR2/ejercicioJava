package exercise_seven.classes;


import exercise_seven.interfaces.IExerciseSeven;
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
public class Function implements IExerciseSeven {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance(){return new Function();}

    /**
     * Se crea insctancia de la función MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    /**
     * Se crea insctancia de la función ScannerExerciseSeven
     */
    static ScannerExerciseSeven scannerExerciseSeven = ScannerExerciseSeven.getInstance();

    /**
     * Método positiveNumber()
     * permite leer por teclado un número y comprueba que este sea mayor o igual que cero
     * en caso contrario, sigue pidiendo el valor
     */
    public void positiveNumber(){
        int number;
        do {
            messagesFunction.getNumber();
            number = scannerExerciseSeven.getInteger();
        }while(number<0);
        messagesFunction.showResult(number);

    }
}
