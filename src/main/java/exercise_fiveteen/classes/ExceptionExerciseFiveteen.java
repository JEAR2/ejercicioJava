package exercise_fiveteen.classes;

public class ExceptionExerciseFiveteen extends RuntimeException{
    public ExceptionExerciseFiveteen(String message, Exception exception) {
        super(message, exception);
    }
}
