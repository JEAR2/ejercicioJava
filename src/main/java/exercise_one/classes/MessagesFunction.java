package exercise_one.classes;

import org.jboss.logging.Logger;

/**
 * Clase MessagesFunction
 * Esta clase permite mostar los mensajes que son incovados por metodos para mostrar información al usuario
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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 1 con POO");}

    /**
     * Método showBiggerNumber
     * Permite mostrar un mensaje en pantalla de acuerdo al parametro recibido
     * @param number parametro recibido para su impresión
     */
    public void showBiggerNumber(Integer number){logger.info("El número mayor es:"+number);}

    /**
     * Método showEqualNumber
     * Permite mostrar un mesnaje en pantalla
     */
    public void showEqualNumber(){logger.info("Los números son iguales");}


}
