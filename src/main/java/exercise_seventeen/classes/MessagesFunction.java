package exercise_seventeen.classes;

import org.jboss.logging.Logger;

/**
 * Clase MessagesFunction
 * Esta clase permite mostrar los mensajes que son invocados por métodos para mostrar información al usuario
 *
 * Autor
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-05/06/22
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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 17 con POO");}

    /**
     *  Método showFinalPrice(int i,double price)
     *  Permite mostrar el precio final de un electrodomestico segun su indice de almacenamiento
     * @param i indice de almacenamiento
     * @param price precio final
     */
    public void showFinalPrice(int i,double price){logger.info("Precio Final Elemento " + i + ": " + price);}

    /**
     * Método  showPriceAppliance(double price)
     * Permite mostrar en pantalla el precio de todos los electrodomesticos
     * @param price precio recibido
     */
    public void showPriceAppliance(double price){logger.info("El valor de los Electrodomesticos es : " + price);}

    /**
     * Método showPriceWashing(double price)
     * Permite mostrar en pantallas e valor de todas las lavadoras vendidas
     * @param price precio total de las lavadoras
     */
    public void showPriceWashing(double price){logger.info("El valor de las lavadoras es : " + price);}

    /**
     * Método showPriceTv(double price)
     * Permite mostrar en pantallas e valor de todos los televisores vendidos
     * @param price precio total de los televisores vendidos
     */
    public void showPriceTv(double price){logger.info("El precio de los televisores es: " + price);}



}
