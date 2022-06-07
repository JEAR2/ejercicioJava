package exercise_sixteen.abstracts;

import java.util.Scanner;

/**
 * Clase Abstract ScannerAbstract
 * Permite inicalizar objetos de tipo Scanner para lectura de datos ingresados por teclado
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-05/06/22
 *
 */
public abstract class ScannerAbstract {

    /**
     * Crea una instancia de la clase Scanner
     */
    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Método getInteger
     * Permite leer un valor ingresado por pantalla
     * El valor ingresado se recibe como String y se convierte a Integer
     *
     * @return lectura del valor convertido
     */
    public Integer getInteger() {
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Método getDouble
     * Permite leer un valor ingresado por pantalla
     * El valor ingresado se recibe como String y se convierte a Double
     *
     * @return lectura del valor convertido
     */
    public Double getDouble() {
        return Double.parseDouble(scanner.nextLine());
    }

    /**
     * Método getString
     * Permite leer un valor ingresado por pantalla
     * El valor se utiliza según la función que la utilice
     *
     */
    public abstract String getString();


}
