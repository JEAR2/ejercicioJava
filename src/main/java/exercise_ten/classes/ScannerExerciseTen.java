package exercise_ten.classes;

import exercise_ten.abstracts.ScannerAbstract;

public class ScannerExerciseTen extends ScannerAbstract {
    public static ScannerExerciseTen getInstance(){return new ScannerExerciseTen();}

    @Override
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptionExerciseTen(exception.getMessage(), exception);
        }
    }
}
