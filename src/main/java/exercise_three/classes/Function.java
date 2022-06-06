package exercise_three.classes;

import exercise_three.interfaces.IExerciseThree;

public class Function implements IExerciseThree {

    public static Function getInstance() {
        return new Function();
    }

    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
