package exercise_fourteen.classes;

import org.jboss.logging.Logger;

public class MessageFunction {

    private static final Logger logger = Logger.getLogger(MessageFunction.class);

    public static MessageFunction getInstance(){return new MessageFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 14 con POO");}

    public void getNumber(){
        logger.info("Ingrese un número: ");
    }

    public void showNumber(int number){
        logger.info(""+number);
    }
}
