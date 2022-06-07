package exercise_twelve.abstracts;

import java.util.Scanner;

/**
 * Clase Abstract ScannerAbstract
 * Permite inicalizar objetos de tipo Scanner para lectura de datos ingresados por teclado
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 *
 */
public abstract class ScannerAbstract {
    /**
     * Crea una instancia de la clase Scanner
     */
    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Método getString
     * Permite leer un valor ingresado por pantalla
     * El valor se utiliza según la función que la utilice
     *
     */
    public abstract String getString();
}
