package exercise_three.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 3 con POO");}


    public void getRadio(){logger.info("Ingrese el valor del radio: ");}

    public void getArea(double area){logger.info("El valor del area es: : "+area);}
}
