package exercise_six;


import exercise_five.classes.MessagesFunction;
import exercise_six.classes.Function;
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
    static Function function = Function.getInstance();
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
    public static void init(){
        messagesFunction.showWelcome();
        function.viewEvenNumbers();
        function.viewOddNumbers();
    }
}
