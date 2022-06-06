package exercise_seventeen.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 17 con POO");}

    public void showFinalPrice(int i,double price){logger.info("Precio Final Elemento " + i + ": " + price);}

    public void showPriceAppliance(double price){logger.info("El valor de los Electrodomesticos es : " + price);}

    public void showPriceWashing(double price){logger.info("El valor de las lavadoras es : " + price);}

    public void showPriceTv(double price){logger.info("El precio de los televisores es: " + price);}



}
