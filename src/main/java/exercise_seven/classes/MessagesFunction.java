package exercise_seven.classes;

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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 7 con POO");}

    /**
     * Método getNumber()
     * Muestra un mensaje por pantalla para pedir al usuario que ingrese un valor
     */
    public void getNumber(){logger.info("Digite un número: ");}

    /**
     * Método showResult
     * Muestra en pantalla el valor ingresado por pantalla despues de haber sido validado
     * @param number valor ingrsado por pantalla
     */
    public void showResult(int number){logger.info("El número ingresado es::  "+number);}

}
