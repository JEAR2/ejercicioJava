package exercise_thirteen.classes;

import org.jboss.logging.Logger;

import java.time.LocalDateTime;

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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 13 con POO");}

    /**
     * Método showDate(LocalDateTime date)
     * Permite mostrar en pantalla la fecha actual sin formatoo alguno
     * @param date fecha actual
     */
    public void showDate(LocalDateTime date){
        logger.info("La fecha sin formato es: "+date);
    }

    /**
     * Método showDateFormat(String date)
     * Permite mostrar en pantalla la fecha actual con un formato preestablecido
     * @param date fecha actual
     */
    public void showDateFormat(String date){
        logger.info("La fecha con formato yyyy/MM/dd HH:mm:ss es: "+date);
    }
}
