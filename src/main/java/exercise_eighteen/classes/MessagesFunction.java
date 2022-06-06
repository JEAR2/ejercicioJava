package exercise_eighteen.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 18 con POO");}

    public void showSeriesDeliver(int series){logger.info("La cantidad de series prestadas es: " + series);}

    public void showVideoGamesDeliver(int videoGames){logger.info("La cantidad de videojuegos prestados es: " + videoGames);}

    public void showSeriesMaxSeason(String seasonTitle, int season){logger.info("La serie con mayor cantidad de temporadas es: " +
            "" + seasonTitle + " con "+season + " Temporadas");}

    public void showVideoGamesMaxHours(String videoGameTitle,int hours){logger.info("El videojuego con mayor cantidad de horas es: " +
            " " + videoGameTitle + " con "+hours+" Horas estimadas");}
}
