package exercise_eight;

import exercise_eight.classes.Function;
import exercise_eight.classes.MessagesFunction;
/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
 */
public class Main {
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    /**
     * Crea una instancia de la clase Function
     */
    static Function function = Function.getInstance();

    /**
     * Método main()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
    public static void main(String[] args) {
        messagesFunction.showWelcome();
        function.workingDay();
    }
}
