package exercise_nine.classes;

public class ExceptionExerciseNine extends RuntimeException{

    public ExceptionExerciseNine(String message, Exception exception) {
        super(message, exception);
    }
}
