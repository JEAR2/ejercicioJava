package exercise_fiveteen.abstracts;

import java.util.Scanner;

public abstract class ScannerAbstract {
    protected static final Scanner scanner = new Scanner(System.in);

    public Integer getInteger(){
        return Integer.parseInt(scanner.nextLine());
    }
}
