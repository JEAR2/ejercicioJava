package exercise_twelve.classes;


import exercise_twelve.abstracts.ScannerAbstract;

public class ScannerExerciseTwelve extends ScannerAbstract {
    public static ScannerExerciseTwelve getInstance(){return new ScannerExerciseTwelve();}

    @Override
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new ExceptionExerciseTwelve(exception.getMessage(), exception);
        }
    }
}
