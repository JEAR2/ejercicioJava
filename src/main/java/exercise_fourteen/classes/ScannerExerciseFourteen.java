package exercise_fourteen.classes;

import exercise_fourteen.abstracts.ScannerAbstract;

public class ScannerExerciseFourteen extends ScannerAbstract {

    public static ScannerExerciseFourteen getInstance(){
        return new ScannerExerciseFourteen();
    }

    @Override
    public Integer getInteger(){
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptionExerciseFourteen(exception.getMessage(), exception);
        }
    }
}
