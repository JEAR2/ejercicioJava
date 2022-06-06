package exercise_ten.classes;

/**
 * Clase ExceptionExerciseTen
 * Está clase permite mostrar las excepciones de errores obtenidas durante el funcionamiento del sitema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-30/05/22
 */
public class ExceptionExerciseTen extends RuntimeException{
    /**
     *Método ExceptionExerciseTen
     * Permite mostrar el mensaje de exception
     * @param message mensaje que arroja la excepción
     */
    public ExceptionExerciseTen(String message, Exception exception) {
        super(message, exception);
    }
}
