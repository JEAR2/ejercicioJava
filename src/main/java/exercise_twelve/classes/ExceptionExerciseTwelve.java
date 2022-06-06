package exercise_twelve.classes;

public class ExceptionExerciseTwelve extends RuntimeException {
    public ExceptionExerciseTwelve(String message, Exception exception) {
        super(message, exception);
    }
}
