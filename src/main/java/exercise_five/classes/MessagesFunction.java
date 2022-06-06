package exercise_five.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 5 con POO");}


    public void showEvenNumbers(){logger.warn("Números Pares ");}

    public void showOddNumbers(){logger.warn("Números Impares ");}

    public void showNumber(Integer number){
        logger.log(Logger.Level.INFO," "+number);
    }
}
