package exercise_three.classes;

public class ExceptionExerciseThree extends RuntimeException{

    public ExceptionExerciseThree(String message, Exception exception) {
        super(message, exception);
    }
}
