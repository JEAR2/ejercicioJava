package exercise_eight.classes;


import exercise_eight.abstracts.ScannerAbstract;
import exercise_three.classes.ExceptionExerciseThree;

public class ScannerExerciseEight extends ScannerAbstract {
    public static ScannerExerciseEight getInstance(){return new ScannerExerciseEight();}

    @Override
    public Integer getInteger(){
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptionExerciseThree(exception.getMessage(), exception);
        }
    }
}
