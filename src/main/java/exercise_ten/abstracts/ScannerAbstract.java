package exercise_ten.abstracts;

import java.util.Scanner;

public abstract class ScannerAbstract {

    protected static final Scanner scanner = new Scanner(System.in);

    public abstract String getString();
}
