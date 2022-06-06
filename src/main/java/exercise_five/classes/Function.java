package exercise_five.classes;

import exercise_five.interfaces.IExerciseFive;


public class Function implements IExerciseFive {

    public static Function getInstance() {
        return new Function();
    }
    static  MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public void viewEvenNumbers() {
        int number = 1;
        messagesFunction.showEvenNumbers();
        while (number <= 100) {
            if (number % 2 == 0) {
                messagesFunction.showNumber(number);
            }
            number++;
        }
    }

    public void viewOddNumbers() {
        int number = 1;
        messagesFunction.showOddNumbers();
        while (number <= 100) {
            if (number % 2 != 0) {
                messagesFunction.showNumber(number);
            }
            number++;
        }
    }
}
