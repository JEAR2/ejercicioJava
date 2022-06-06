package exercise_one.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 1 con POO");}

    public void showBiggerNumber(Integer number){logger.info("El número mayor es:"+number);}

    public void showEqualNumber(){logger.info("Los números son iguales");}


}
