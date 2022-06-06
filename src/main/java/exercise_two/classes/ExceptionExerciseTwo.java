package exercise_two.classes;

public class ExceptionExerciseTwo extends RuntimeException{

    public ExceptionExerciseTwo(String message, Exception exception) {
        super(message, exception);
    }
}
