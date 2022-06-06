package exercise_four.classes;

import exercise_four.abstracts.ScannerAbstract;
import exercise_three.classes.ExceptionExerciseThree;

public class ScannerExerciseFour extends ScannerAbstract {
    public static ScannerExerciseFour getInstance(){return new ScannerExerciseFour();}

    @Override
    public Double getDouble(){
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new ExceptionExerciseThree(exception.getMessage(), exception);
        }
    }
}
