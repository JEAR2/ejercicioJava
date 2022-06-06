package exercise_seven.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 7 con POO");}


    public void getNumber(){logger.info("Digite un número: ");}

    public void showResult(int number){logger.info("El número ingresado es::  "+number);}

}
