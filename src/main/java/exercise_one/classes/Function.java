package exercise_one.classes;


import exercise_one.interfaces.IExerciseOne;

public class Function implements IExerciseOne {

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
