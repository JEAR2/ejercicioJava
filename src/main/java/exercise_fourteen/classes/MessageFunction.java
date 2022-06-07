package exercise_fourteen.classes;

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
public class MessageFunction {

    /**
     * Se crea una instancia de la clase logger, la cual permite mostrar mensajes en pantalla
     */
    private static final Logger logger = Logger.getLogger(MessageFunction.class);

    /**
     * Método getIntance
     * Crea una instancia de la clase MessageFunction
     * @return una instancia de la clase
     */
    public static MessageFunction getInstance(){return new MessageFunction();}

    /**
     * Método showWelcome()
     * Permite mostrar un mensaje de bienvenida
     */
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 14 con POO");}

    /**
     * Método getNumber()
     * Permite mostrar en pantalla un mensaje indicando al usuario que ingrese un número
     */
    public void getNumber(){
        logger.info("Ingrese un número: ");
    }

    /**
     * Método  showNumber(int number)
     * Permite mostrar en pantalla el valor recibido como parametro
     * @param number valor a mostrar en pantalla
     */
    public void showNumber(int number){
        logger.info(""+number);
    }
}
