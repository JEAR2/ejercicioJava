package exercise_four.abstracts;

import java.util.Scanner;

public abstract class ScannerAbstract {
    protected static final Scanner scanner = new Scanner(System.in);

    public Double getDouble(){
        return Double.parseDouble(scanner.nextLine());
    }

}
