package exercise_four.classes;

import exercise_four.interfaces.IExerciseFour;

public class Function implements IExerciseFour {

    public static Function getInstance() {
        return new Function();
    }
    @Override
    public double calculatePrice(double price) {
        double iva = 0.21;
        return price + price * iva;
    }
}
