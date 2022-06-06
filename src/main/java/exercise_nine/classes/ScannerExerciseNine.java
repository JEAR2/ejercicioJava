package exercise_nine.classes;

import exercise_nine.abstracts.ScannerAbstract;

public class ScannerExerciseNine extends ScannerAbstract {
    public static ScannerExerciseNine getInstance(){return new ScannerExerciseNine();}

    @Override
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptionExerciseNine(exception.getMessage(), exception);
        }
    }
}
