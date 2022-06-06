package exercise_eleven.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 11 con POO");}

    public void getPhraseUser(){
        logger.info("Ingrese una frase: ");
    }

    public void showLengthPhrase(int number){
        logger.info("El tamaño de la frase es: "+number+" caracteres");
    }


    public void showPhrase(String phrase){
        logger.info("La frase es: "+phrase);
    }

    public void showVowels(int number){
        logger.info("cantidad de vocales: "+number);
    }
}
