package exercise_four.classes;

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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 4 con POO");}
    /**
     * Método showWelcome
     * Permite mostrar un mensaje de bienvenida
     */
    public void getPrice(){logger.info("Ingrese el precio del producto: ");}

    /**
     * Método showPriceIva
     * Permite mostrar al usuario un mensaje con el valor del producto incluido el iva
     * @param price valor del producto con el iva incluido
     */
    public void showPriceIva(double price){logger.info("El valor del producto incluido el iva es:  "+price);}
}
