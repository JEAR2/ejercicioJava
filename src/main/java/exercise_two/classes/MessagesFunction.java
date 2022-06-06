package exercise_two.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 2 con POO");}

    public void showBiggerNumber(Integer number){logger.info("El número mayor es:"+number);}

    public void showEqualNumber(){logger.info("Los números son iguales");}

    public void getNumberOne(){logger.info("Ingrese el primer Número: ");}

    public void getNumberTwo(){logger.info("Ingrese el segundo Número: ");}
}
