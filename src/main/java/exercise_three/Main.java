package exercise_three;

import exercise_three.classes.Function;
import exercise_three.classes.ScannerExerciseThree;
import exercise_three.classes.MessagesFunction;
/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */

public class Main {
    /**
     * Crea una instancia de la clase Function
     */
    static Function function =Function.getInstance();
    /**
     * Crea una instancia de la clase ScannerExerciseThree
     */
    static ScannerExerciseThree scannerExerciseThree = ScannerExerciseThree.getInstance();
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    public static void main(String[] args) {
        init();
    }
    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
    private static void init(){
        messagesFunction.showWelcome();
        double radius;
        double area;
        messagesFunction.getRadio();
        radius = scannerExerciseThree.getDouble();
        area = function.calculateArea(radius);
        messagesFunction.getArea(area);
    }
}
