package exercise_sixteen.classes;
/**
 * Clase ExceptionExerciseSixteen
 * Está clase permite mostrar las excepciones de errores obtenidas durante el funcionamiento del sitema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class ExceptionExerciseSixteen extends RuntimeException{

    /**
     *Método ExceptionExerciseSixteen
     * Permite mostrar el mensaje de exception
     * @param message mensaje que arroja la excepción
     */
    public ExceptionExerciseSixteen(String message, Exception exception) {
        super(message, exception);
    }
}
