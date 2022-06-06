package exercise_fourteen.classes;

public class ExceptionExerciseFourteen extends RuntimeException{
    public ExceptionExerciseFourteen(String message, Exception exception) {
        super(message, exception);
    }
}
