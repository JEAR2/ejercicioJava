package exercise_twelve.classes;

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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 12 con POO");}

    /**
     * Método getWordOne()
     * Permite mostrar en pantalla un mensaje indicando al usuario que ingrese un valor
     */
    public void getWordOne(){
        logger.info("Ingrese la primera palabra: ");
    }

    /**
     * Método getWordTwo()
     * Permite mostrar en pantalla un mensaje indicando al usuario que ingrese un valor
     */
    public void getWordTwo(){
        logger.info("Ingrese la segunda palabra: ");
    }

    /**
     * Método showWordEquals()
     * Permite mostrar en pantalla un mensaje indicando al usuario que los valores ingresado son iguales
     */
    public void showWordEquals(){
        logger.info("Las palabras son Iguales ");
    }

    /**
     * Método showWordNoEquals()
     * Permite mostrar en pantalla un mensaje indicando al usuario que los valores ingresado no son iguales
     */
    public void showWordNoEquals(){
        logger.info("Las palabras No son Iguales ");
    }

    /**
     * Método showWords(String firstWord, String secondWord)
     * Permite recibir y mostrar en pantalla las palabras ingresadas por el usuario para mostrar su diferencia
     * @param firstWord primera palabra ingresada
     * @param secondWord segunda palabra ingresada
     */
    public void showWords(String firstWord, String secondWord){
        logger.info("Primera palabra: "+firstWord+" - Segunda palabra: "+secondWord);
    }

}
