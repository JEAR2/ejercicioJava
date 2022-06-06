package exercise_ten.classes;

import org.jboss.logging.Logger;
/**
 * Clase MessagesFunction
 * Esta clase permite mostrar los mensajes que son invocados por métodos para mostrar información al usuario
 *
 * Autor
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 10 con POO");}

    /**
     * Método getPhraseUser()
     * Permite mostrar en pantalla un mensaje para indicar al usuario que ingrese una frase
     */
    public void getPhraseUser(){
        logger.info("Ingrese una frase: ");
    }

    /**
     * Método showPhrase()
     * Permite mostrar en pantalla la frase ingresado por pantalla sin espacios
     * @param phrase frase ingresado por el usuairo y enviada como parametro
     */
    public void showPhrase(String phrase){
        logger.info("La frase sin espacios es: "+phrase);
    }

}
