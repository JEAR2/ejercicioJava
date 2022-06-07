package exercise_eighteen.classes;

/**
 * Clase Function
 * Esta clase permite crear todas las funciones o métodos para ser invocados
 * desde cualquier clase del sistema para su funcionamineto
 *
 * Autor
 * John Edward Acevedo rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */
public class Function {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance(){return new Function();}


    /**
     * Se crea instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    /**
     * Método seriesDeliver(Serie[] series)
     * Permite conocer la cantidad de series prestadas
     * @param series arreglo de series almacenadas
     */
    public void seriesDeliver(Serie[] series){
        int acumSeriesDeliver = 0;
        for (Serie serie : series) {
            if (serie.isDelivered()) {
                acumSeriesDeliver++;
                serie.toReturn();
            }
        }
        messagesFunction.showSeriesDeliver(acumSeriesDeliver);
    }

    /**
     * Método videoGamesDeliver(VideoGame[] videoGames)
     * Permite conocer la cantidadd de vidoeJuegos prestados
     * @param videoGames arreglo con los videoJuegos almacenados
     */
    public void videoGamesDeliver(VideoGame[] videoGames){
        int acumVideGamesDeliver = 0;

        for (VideoGame videoGame: videoGames) {
            if (videoGame.isDelivered()) {
                acumVideGamesDeliver++;
                videoGame.toReturn();
            }
        }
        messagesFunction.showVideoGamesDeliver(acumVideGamesDeliver);
    }

    /**
     * Método seriesMaxSeason(Serie[] series)
     * Permite conocer la serie con mayor cantidad de temporadas
     * @param series arreglo de series almacenadas
     */
    public void seriesMaxSeason(Serie[] series){
        Serie serieMaxSeason = new Serie();
        for (Serie serie: series) {
            if (serieMaxSeason.compareTo(serie) != 1) {
                serieMaxSeason = serie;
            }
        }
        messagesFunction.showSeriesMaxSeason(serieMaxSeason.getTitle(),serieMaxSeason.getNumberOfSeasons());
    }

    /**
     * Método videoGamesMaxEstimatedHours(VideoGame[] videoGames)
     * Permite conocer el videojuego con mayor horas estimadas
     * @param videoGames arreglo con los videoJuegos almacenados
     */
    public void videoGamesMaxEstimatedHours(VideoGame[] videoGames){
        VideoGame videoGameMaxHours = new VideoGame();
        for (VideoGame videoGame: videoGames) {
            if (videoGameMaxHours.compareTo(videoGame) != 1) {
                videoGameMaxHours =  videoGame;
            }
        }
        messagesFunction.showVideoGamesMaxHours(videoGameMaxHours.getTitle(),videoGameMaxHours.getEstimatedHours());
    }


}
