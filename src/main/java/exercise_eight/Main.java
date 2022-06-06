package exercise_eight;

import exercise_eight.classes.Function;
import exercise_eight.classes.MessagesFunction;

public class Main {
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    static Function function = Function.getInstance();

    public static void main(String[] args) {
        messagesFunction.showWelcome();
        function.workingDay();
    }
}
