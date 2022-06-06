package exercise_seven.classes;

import exercise_seven.abstracts.ScannerAbstract;
import exercise_sixteen.classes.ExceptioExerciseSixteen;

public class ScannerExerciseSeven extends ScannerAbstract {
    public static ScannerExerciseSeven getInstance(){return new ScannerExerciseSeven();}

    @Override
    public Integer getInteger() {
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new ExceptioExerciseSixteen(exception.getMessage(), exception);
        }
    }

    @Override
    public Double getDouble() {
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new ExceptioExerciseSixteen(exception.getMessage(), exception);
        }
    }

    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptioExerciseSixteen(exception.getMessage(), exception);
        }
    }
}
