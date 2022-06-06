package exercise_seven.classes;


import exercise_seven.interfaces.IExerciseSeven;

public class Function implements IExerciseSeven {
    public static Function getInstance(){return new Function();}
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    static ScannerExerciseSeven scannerExerciseSeven = ScannerExerciseSeven.getInstance();
    public void positiveNumber(){
        int number;
        do {
            messagesFunction.getNumber();
            number = scannerExerciseSeven.getInteger();
        }while(number<0);
        messagesFunction.showResult(number);

    }
}
