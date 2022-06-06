package exercise_two.classes;

import exercise_two.interfaces.IExerciseTwo;

public class Function implements IExerciseTwo {

    public static Function getInstance() {
        return new Function();
    }

    MessagesFunction messagesFunction = MessagesFunction.getInstance();

    @Override
    public void compare(Integer numberOne, Integer numberTwo) {

        if (numberOne > numberTwo) {
            messagesFunction.showBiggerNumber(numberOne);
        } else if (numberTwo > numberOne) {
            messagesFunction.showBiggerNumber(numberTwo);
        } else {
            messagesFunction.showEqualNumber();
        }
    }
}
