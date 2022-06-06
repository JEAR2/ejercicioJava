package exercise_eighteen.classes;


public class Function {

    public static Function getInstance(){return new Function();}

    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

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

    public void seriesMaxSeason(Serie[] series){
        Serie serieMaxSeason = new Serie();
        for (Serie serie: series) {
            if (serieMaxSeason.compareTo(serie) != 1) {
                serieMaxSeason = serie;
            }
        }
        messagesFunction.showSeriesMaxSeason(serieMaxSeason.getTitle(),serieMaxSeason.getNumberOfSeasons());
    }

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
