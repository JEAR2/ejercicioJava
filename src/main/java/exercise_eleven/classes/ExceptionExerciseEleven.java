package exercise_eleven.classes;

public class ExceptionExerciseEleven extends RuntimeException{
    public ExceptionExerciseEleven(String message, Exception exception) {
        super(message, exception);
    }
}
