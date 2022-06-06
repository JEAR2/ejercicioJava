package exercise_five;

import exercise_five.classes.Function;
import exercise_five.classes.MessagesFunction;

public class Main {
    static  Function function = Function.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public static void main(String[] args) {
        init();
    }

    public static void init(){
        messagesFunction.showWelcome();
        function.viewEvenNumbers();
        function.viewOddNumbers();
    }


}
