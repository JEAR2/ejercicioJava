package exercise_fifteen.classes;

/**
 * Clase ExceptionExerciseFifteen
 * Está clase permite mostrar las excepciones de errores obtenidas durante el funcionamiento del sitema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class ExceptionExerciseFifteen extends RuntimeException{
    /**
     *Método ExceptionExerciseFifteen
     * Permite mostrar el mensaje de exception
     * @param message mensaje que arroja la excepción
     */
    public ExceptionExerciseFifteen(String message, Exception exception) {
        super(message, exception);
    }
}
