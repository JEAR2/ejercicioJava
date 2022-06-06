package exercise_nine.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 9 con POO");}

    public String getPhrase(){
        String phrase =  "La sonrisa sera la mejor arma contra la tristeza";
        return phrase + " ";
    }

    public void getPhraseUser(){
        logger.info("Ingrese una frase: ");
    }

    public void showPhrase(String phrase){
        logger.info("La frase contatenada con la ingresada es: "+phrase);
    }
}
