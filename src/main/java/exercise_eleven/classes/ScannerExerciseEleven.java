package exercise_eleven.classes;

import exercise_eleven.abstracts.ScannerAbstract;

public class ScannerExerciseEleven extends ScannerAbstract {
    public static ScannerExerciseEleven getInstance(){return new ScannerExerciseEleven();}

    @Override
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptionExerciseEleven(exception.getMessage(), exception);
        }
    }
}
