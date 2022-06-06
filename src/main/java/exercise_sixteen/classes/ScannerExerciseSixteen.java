package exercise_sixteen.classes;

import exercise_sixteen.abstracts.ScannerAbstract;

public class ScannerExerciseSixteen extends ScannerAbstract {
    public static ScannerExerciseSixteen getInstance() {
        return new ScannerExerciseSixteen();
    }

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

    @Override
    public char getChar() {
            return scanner.next().charAt(0);
    }

    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptioExerciseSixteen(exception.getMessage(), exception);
        }
    }
}
