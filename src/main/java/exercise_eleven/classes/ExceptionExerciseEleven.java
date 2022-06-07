package exercise_eleven.classes;

/**
 * Clase ExceptionExerciseEleven
 * Está clase permite mostrar las excepciones de errores obtenidas durante el funcionamiento del sitema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class ExceptionExerciseEleven extends RuntimeException{

    /**
     *Método ExceptionExerciseEleven
     * Permite mostrar el mensaje de exception
     * @param message mensaje que arroja la excepción
     */
    public ExceptionExerciseEleven(String message, Exception exception) {
        super(message, exception);
    }
}
