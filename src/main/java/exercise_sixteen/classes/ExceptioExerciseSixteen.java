package exercise_sixteen.classes;

public class ExceptioExerciseSixteen extends RuntimeException{
    public ExceptioExerciseSixteen(String message, Exception exception) {
        super(message, exception);
    }
}
