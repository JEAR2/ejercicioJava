package exercise_three.classes;


import exercise_three.abstracts.ScannerAbstract;

public class ScannerExerciseThree extends ScannerAbstract {

    public static ScannerExerciseThree getInstance(){
        return new ScannerExerciseThree();
    }
    @Override
    public Double getDouble(){
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new ExceptionExerciseThree(exception.getMessage(), exception);
        }
    }


}
