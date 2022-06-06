package exercise_thirteen.classes;

import org.jboss.logging.Logger;

import java.time.LocalDateTime;

public class MessagesFunction {
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 13 con POO");}

    public void showDate(LocalDateTime date){
        logger.info("La fecha sin formato es: "+date);
    }

    public void showDateFormat(String date){
        logger.info("La fecha con formato yyyy/MM/dd HH:mm:ss es: "+date);
    }
}
