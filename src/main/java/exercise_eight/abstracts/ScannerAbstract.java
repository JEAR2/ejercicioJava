package exercise_eight.abstracts;

import java.util.Scanner;

public abstract class ScannerAbstract {

    protected static final Scanner scanner = new Scanner(System.in);

    public Integer getInteger(){
        return Integer.parseInt(scanner.nextLine());
    }
}
