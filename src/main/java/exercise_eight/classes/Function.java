package exercise_eight.classes;


public class Function {

    public static Function getInstance(){return new Function();}
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    static ScannerExerciseEight scannerExerciseEight = ScannerExerciseEight.getInstance();
    public void workingDay() {
        int day;
        messagesFunction.getDay();
        day = scannerExerciseEight.getInteger();
        switch (day) {
            case 1:
                messagesFunction.showWorkingDay("Lunes");
                break;
            case 2:
                messagesFunction.showWorkingDay("Martes");
                break;
            case 3:
                messagesFunction.showWorkingDay("Miercoles");
                break;
            case 4:
                messagesFunction.showWorkingDay("Jueves");
                break;
            case 5:
                messagesFunction.showWorkingDay("Viernes");
                break;
            case 6:
                messagesFunction.showNotWorkingDay("Sábado");
                break;
            case 7:
                messagesFunction.showNotWorkingDay("Domingo");
                break;
            default:
                messagesFunction.showNoValidDay();
                break;
        }
    }
}
