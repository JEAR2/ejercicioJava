package exercise_fourteen.classes;

import exercise_fourteen.interfaces.IExerciseFourteen;


public class Function implements IExerciseFourteen {

    public static Function getInstance(){return new Function();}
    static MessageFunction messageFunction = MessageFunction.getInstance();
    @Override
    public void loopValues(int number) {
        while(number<=1000){
            messageFunction.showNumber(number);
            number=number+2;
        }
    }
}
