package exercise_five.classes;

import org.jboss.logging.Logger;
/**
 * Clase MessagesFunction
 * Esta clase permite mostrar los mensajes que son invocados por métodos para mostrar información al usuario
 *
 * Autor
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
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
     * Método showWelcome
     * Permite mostrar un mensaje de bienvenida
     */
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 5 con POO");}

    /**
     * Método showEvenNumbers()
     * Permite mostrar un mensaje en pantalla
     */
    public void showEvenNumbers(){logger.warn("Números Pares ");}
    /**
     * Método showOddNumbers()
     * Permite mostrar un mensaje en pantalla
     */
    public void showOddNumbers(){logger.warn("Números Impares ");}
    /**
     * Método showNumber()
     * Permite mostrar un mensaje en pantalla (valor numerico) recibido como parametro
     */
    public void showNumber(Integer number){
        logger.log(Logger.Level.INFO," "+number);
    }
}
