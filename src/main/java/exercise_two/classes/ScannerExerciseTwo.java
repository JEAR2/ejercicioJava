package exercise_two.classes;

import exercise_two.abstracts.ScannerAbstract;

public class ScannerExerciseTwo extends ScannerAbstract {

    public static ScannerExerciseTwo getInstance(){
        return new ScannerExerciseTwo();
    }
    @Override
    public Integer getInteger(){
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptionExerciseTwo(exception.getMessage(), exception);
        }
    }


}
