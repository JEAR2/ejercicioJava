package exercise_sixteen.abstracts;

import java.util.Scanner;

public abstract class ScannerAbstract {

    protected static final Scanner scanner = new Scanner(System.in);

    public Integer getInteger() {
        return Integer.parseInt(scanner.nextLine());
    }

    public Double getDouble() {
        return Double.parseDouble(scanner.nextLine());
    }

    public char getChar() {
        return (scanner.next().charAt(0));
    }

    public abstract String getString();

    public void close() {
        scanner.close();
    }

}
