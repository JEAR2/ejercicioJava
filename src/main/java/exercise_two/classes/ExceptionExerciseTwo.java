package exercise_two.classes;

/**
 * Clase ExceptionExerciseTwo
 * Está clase permite mostrar las excepciones de errores obtenidas durante el funcionamiento del sitema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */
public class ExceptionExerciseTwo extends RuntimeException{
    /**
     *Método ExceptionExerciseTwo
     * Permite mostrar el mensaje de exception
     * @param message mensaje que arroja la excepción
     */
    public ExceptionExerciseTwo(String message, Exception exception) {
        super(message, exception);
    }
}
