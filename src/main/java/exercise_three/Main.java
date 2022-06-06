package exercise_three;

import exercise_three.classes.Function;
import exercise_three.classes.ScannerExerciseThree;
import exercise_three.classes.MessagesFunction;


public class Main {

    static Function function =Function.getInstance();
    static ScannerExerciseThree scannerExerciseThree = ScannerExerciseThree.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    public static void main(String[] args) {
        init();
    }

    private static void init(){
        messagesFunction.showWelcome();
        double radius;
        double area;
        messagesFunction.getRadio();
        radius = scannerExerciseThree.getDouble();
        area = function.calculateArea(radius);
        messagesFunction.getArea(area);
    }
}
