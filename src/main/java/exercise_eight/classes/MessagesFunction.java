package exercise_eight.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 8 con POO");}


    public void getDay(){logger.info("Digite un dia de la semana [1.Lunes - 2. Martes - 3. Miercoles - 4. Jueves" +
            " 5. Viernes - 6. Sábado - 7. Domingo ]: ");}

    public void showWorkingDay(String day){logger.info("Dia Laboral :  "+day);}

    public void showNotWorkingDay(String day){logger.info("Dia No Laboral :  "+day);}

    public void showNoValidDay(){logger.info("El dia ingresado no pertenece a los 7 dias de la semana ");}

}
