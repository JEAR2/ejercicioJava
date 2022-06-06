package exercise_eight.classes;

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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 8 con POO");}

    /**
     * Método getDay()
     * Permite mostrar al usuaio un mensaje indicando al usuario pedir el valor del dia
     */
    public void getDay(){logger.info("Digite un dia de la semana [1.Lunes - 2. Martes - 3. Miercoles - 4. Jueves" +
            " 5. Viernes - 6. Sábado - 7. Domingo ]: ");}

    /**
     * Método showWorkingDay(String day)
     * Permite mostrar en pantalla un mensaje acompañado del valor ingresado por el usuario y recibido como parametro
     * @param day valor ingresado por el usuario
     */
    public void showWorkingDay(String day){logger.info("Dia Laboral :  "+day);}

    /**
     * Método showNotWorkingDay(String day)
     * Permite mostrar en pantalla un mensaje acompañado del valor ingresado por el usuario y recibido como parametro
     * @param day valor ingresado por el usuario
     */
    public void showNotWorkingDay(String day){logger.info("Dia No Laboral :  "+day);}

    /**
     * Método showNoValidDay()
     * Permite mostrar en pantalla un mensaje indicando al usuario que el valor ingresado es erroneo
     */
    public void showNoValidDay(){logger.info("El dia ingresado no pertenece a los 7 dias de la semana ");}

}
