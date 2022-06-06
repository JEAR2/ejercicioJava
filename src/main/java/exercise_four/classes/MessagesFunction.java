package exercise_four.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 4 con POO");}


    public void getPrice(){logger.info("Ingrese el precio del producto: ");}

    public void showPriceIva(double price){logger.info("El valor del producto incluido el iva es:  "+price);}
}
