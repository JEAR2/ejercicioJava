package exercise_seven;

import exercise_seven.classes.Function;
import exercise_seven.classes.MessagesFunction;
import org.jboss.logging.Messages;

public class Main {
    static Function function = Function.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public static void main(String[] args) {
        messagesFunction.showWelcome();
        function.positiveNumber();

    }
}
