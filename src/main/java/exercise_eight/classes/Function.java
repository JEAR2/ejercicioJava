package exercise_eight.classes;

import exercise_eight.interfaces.IExerciseEight;

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
public class Function implements IExerciseEight {
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
     * Se crea insctancia de la función scannerExerciseEight
     */
    static ScannerExerciseEight scannerExerciseEight = ScannerExerciseEight.getInstance();

    /**
     * Método workingDay()
     * Permite mostrar un mensaje en pantalla dependiento de la opción ingresado por el usuario
     * Las opciones pueden ser 'Dia Loboral' o 'Dia No Laboral'
     */
    public void workingDay() {
        int day;
        messagesFunction.getDay();
        day = scannerExerciseEight.getInteger();
        switch (day) {
            case 1:
                messagesFunction.showWorkingDay("Lunes");
                break;
            case 2:
                messagesFunction.showWorkingDay("Martes");
                break;
            case 3:
                messagesFunction.showWorkingDay("Miercoles");
                break;
            case 4:
                messagesFunction.showWorkingDay("Jueves");
                break;
            case 5:
                messagesFunction.showWorkingDay("Viernes");
                break;
            case 6:
                messagesFunction.showNotWorkingDay("Sábado");
                break;
            case 7:
                messagesFunction.showNotWorkingDay("Domingo");
                break;
            default:
                messagesFunction.showNoValidDay();
                break;
        }
    }
}
