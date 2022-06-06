package exercise_fiveteen.classes;

import exercise_fiveteen.abstracts.ScannerAbstract;

public class ScannerExerciseFiveteen extends ScannerAbstract {
    public static ScannerExerciseFiveteen getInstance(){
        return new ScannerExerciseFiveteen();
    }

    @Override
    public Integer getInteger(){
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptionExerciseFiveteen(exception.getMessage(), exception);
        }
    }
}
