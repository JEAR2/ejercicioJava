package exercise_ten.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 10 con POO");}

    public void getPhraseUser(){
        logger.info("Ingrese una frase: ");
    }

    public void showPhrase(String phrase){
        logger.info("La frase sin espacios es: "+phrase);
    }

}
