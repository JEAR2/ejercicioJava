package exercise_nine.classes;

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
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 9 con POO");}

    /**
     * Método getPhrase()
     * Permite obtener la frase ingresada en el sistema
     * @return la frase ingresada
     */
    public String getPhrase(){
        String phrase =  "La sonrisa sera la mejor arma contra la tristeza";
        return phrase + " ";
    }

    /**
     * Método getPhraseUser
     * Permite obtener la frase ingresada en el usuario (Pidiendo el valor por pantalla)
     */
    public void getPhraseUser(){
        logger.info("Ingrese una frase: ");
    }

    /**
     * Método showPhrase()
     * Permite mostrar en pantalla la frase ingresada por el usuario concatenada con la modificado por el sistema
     * @param phrase frase a mostrar
     */
    public void showPhrase(String phrase){
        logger.info("La frase contatenada con la ingresada es: "+phrase);
    }
}
