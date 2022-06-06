package exercise_three.classes;
/**
 * Clase ExceptionExerciseThree
 * Está clase permite mostrar las excepciones de errores obtenidas durante el funcionamiento del sitema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */
public class ExceptionExerciseThree extends RuntimeException{
    /**
     *Método ExceptionExerciseThree
     * Permite mostrar el mensaje de exception
     * @param message mensaje que arroja la excepción
     */
    public ExceptionExerciseThree(String message, Exception exception) {
        super(message, exception);
    }
}
