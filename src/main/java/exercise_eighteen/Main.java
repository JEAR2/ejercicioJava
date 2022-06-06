package exercise_eighteen;

import exercise_eighteen.classes.Function;
import exercise_eighteen.classes.MessagesFunction;
import exercise_eighteen.classes.Serie;
import exercise_eighteen.classes.VideoGame;

public class Main {
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    static Function function = Function.getInstance();
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        messagesFunction.showWelcome();
        Serie[] series = new Serie[5];
        VideoGame[] videoGames = new VideoGame[5];
        Serie serieOne = new Serie("Normal People", "Sally Rooney");
        Serie serieTwo = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
        Serie serieThree = new Serie("Los Soprano", 6, "Drama", "David Chase");
        Serie serieFour = new Serie("Normal People", "Sally Rooney");
        Serie serieFive = new Serie("Juego de tronos", 8, "Fantasia- Drama", "David Benioff y D. B. Weiss");
        series[0] = serieOne;
        series[1] = serieTwo;
        series[2] = serieThree;
        series[3] = serieFour;
        series[4] = serieFive;

        series[0].deliver();
        series[2].deliver();
        series[4].deliver();


        VideoGame videoGameOne = new VideoGame("Control", 12, "Disparos - acción - aventura", "Remedy Entertainment");
        VideoGame videoGameTwo = new VideoGame("Grand Theft Auto V", 25);
        VideoGame videoGameThree = new VideoGame("Leyendas Pokémon: Arceus", 30);
        VideoGame videoGameFour = new VideoGame("Lego Star Wars: The Skywalker Saga", 25, "Acción - Aventura", "Warner Bros. Interactive Entertainment");
        VideoGame videoGameFive = new VideoGame("Elden Ring", 14);
        videoGames[0] = videoGameOne;
        videoGames[1] = videoGameTwo;
        videoGames[2] = videoGameThree;
        videoGames[3] = videoGameFour;
        videoGames[4] = videoGameFive;

        videoGames[0].deliver();
        videoGames[3].deliver();

        function.seriesDeliver(series);
        function.videoGamesDeliver(videoGames);

        function.seriesMaxSeason(series);
        function.videoGamesMaxEstimatedHours(videoGames);

    }
}
