package exercise_nine.classes;

import exercise_nine.interfaces.IExerciseNine;

public class Function implements IExerciseNine {

    public static Function getInstance(){return new Function();}
    public String change(String phrase) {
        return phrase.replace("a", "e");

    }
}
