package exercise_six.classes;

import exercise_six.interfaces.IExerciseSix;


public class Function implements IExerciseSix {

    public static Function getInstance() {
        return new Function();
    }
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public void viewEvenNumbers() {
        messagesFunction.showEvenNumbers();
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                messagesFunction.showNumber(number);
            }
        }
    }

    public void viewOddNumbers() {
        messagesFunction.showOddNumbers();
        for (int number = 1; number <= 100; number++) {
            if (number % 2 != 0) {
                messagesFunction.showNumber(number);
            }
        }
    }
}
