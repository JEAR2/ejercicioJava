package exercise_eighteen.classes;

import org.jboss.logging.Logger;

/**
 * Clase MessagesFunction
 * Esta clase permite mostrar los mensajes que son invocados por métodos para mostrar información al usuario
 *
 * Autor
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-05/06/22
 */
public class MessagesFunction {
    /**
     * Se crea una instancia de la clase logger, la cual permite mostrar mensajes en pantalla
     */
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    /**
     * Método getIntance
     * Crea una instancia de la clase MessageFunction
     * @return una instancia de la clase
     */
    public static MessagesFunction getInstance(){return new MessagesFunction();}

    /**
     * Método showWelcome()
     * Permite mostrar un mensaje de bienvenida
     */
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 18 con POO");}

    /**
     * Método showSeriesDeliver(int series)
     * Muestra en pantalla un mensaje con la cantidad de series prestadas
     * @param series cantidad de series prestadas
     */
    public void showSeriesDeliver(int series){logger.info("La cantidad de series prestadas es: " + series);}

    /**
     * Método showVideoGamesDeliver(int videoGames)
     * Muestra en pantalla un mensaje con la cantidad de videojuegos prestados
     * @param videoGames cantidad de videojuegos prestados
     */
    public void showVideoGamesDeliver(int videoGames){logger.info("La cantidad de videojuegos prestados es: " + videoGames);}

    /**
     * Método showSeriesMaxSeason(String seasonTitle, int season)
     * Muestra en pantalla la serie con mayor cantidad de temporadas
     * @param seasonTitle titulo de la serie
     * @param season cantidad de temporadas
     */
    public void showSeriesMaxSeason(String seasonTitle, int season){logger.info("La serie con mayor cantidad de temporadas es: " +
            "" + seasonTitle + " con "+season + " Temporadas");}

    /**
     * Método showVideoGamesMaxHours(String videoGameTitle,int hours)
     * Muestra en pantalla el videojuego con mayor cantidad de horas estimadas
     * @param videoGameTitle titulo del videojuego
     * @param hours cantidad de horas estimadas
     */
    public void showVideoGamesMaxHours(String videoGameTitle,int hours){logger.info("El videojuego con mayor cantidad de horas es: " +
            " " + videoGameTitle + " con "+hours+" Horas estimadas");}
}
