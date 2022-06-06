package exercise_one;


import exercise_one.classes.Function;
import exercise_one.classes.MessagesFunction;


public class Main {
    static Function functions = Function.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    public static void main(String[] args) {
        init();

    }

    private static void init(){
        messagesFunction.showWelcome();
        int numberone = 5;
        int numbertwo =2;
        functions.compare(numberone, numbertwo);
    }
}
