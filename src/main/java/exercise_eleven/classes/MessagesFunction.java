package exercise_eleven.classes;

import org.jboss.logging.Logger;

/**
 * Clase MessagesFunction
 * Esta clase permite mostrar los mensajes que son invocados por métodos para mostrar información al usuario
 *
 * Autor
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class MessagesFunction {

    /**
     * Se crea una instancia de la clase logger, la cual permite mostrar mensajes en pantalla
     */
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    /**
     * Método getIntance
     * Crea una instancia de la clase MessageFunction
     * @return una instancia de la clase
     */
    public static MessagesFunction getInstance(){return new MessagesFunction();}

    /**
     * Método showWelcome()
     * Permite mostrar un mensaje de bienvenida
     */
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 11 con POO");}

    /**
     * Método getPhraseUser()
     * Permite inidicar al usuario por pantalla que ingrese una frase por teclado
     */
    public void getPhraseUser(){
        logger.info("Ingrese una frase: ");
    }

    /**
     * Método showLengthPhrase(int number)
     * Permite mostrar un mensaje en pantalla indicando al usuario la longitud de la frase ingresada
     * @param number valor obtenido de la longitud de caracteres de la frase
     */
    public void showLengthPhrase(int number){
        logger.info("El tamaño de la frase es: "+number+" caracteres");
    }

    /**
     * Método showPhrase(String phrase)
     * Permite mostrar en pantalla la frase ingresada por el usuario
     * @param phrase frase ingresada por el usuario
     */
    public void showPhrase(String phrase){
        logger.info("La frase es: "+phrase);
    }

    /**
     * Método showVowels(int number)
     * Permite mostrar en pantalla la cantidad de vocales incluidas en la frase ingresada
     * @param number cantidad de vocales en la frase
     */
    public void showVowels(int number){
        logger.info("cantidad de vocales: "+number);
    }
}
