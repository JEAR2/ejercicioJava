package exercise_eighteen.interfaces;

/**
 * Interface Delivered
 * Permite controlar ciertos métodos con los que debe contar el sistema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-05/06/22
 */
public interface Delivered {
    void deliver();
    void toReturn();
    boolean isDelivered();
    int compareTo(Object a);

}
