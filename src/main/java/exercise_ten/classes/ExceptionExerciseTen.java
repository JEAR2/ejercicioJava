package exercise_ten.classes;

public class ExceptionExerciseTen extends RuntimeException{
    public ExceptionExerciseTen(String message, Exception exception) {
        super(message, exception);
    }
}
