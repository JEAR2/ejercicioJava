package exercise_one.classes;

/**
 * Clase MyException
 * Está clase permite mostrar las excepciones de errores obtenidas durante el funcionamiento del sitema
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-29/05/22
 */
public class MyException extends RuntimeException{
    /**
     *Método MyException
     * Permite mostrar el mensaje de exception
     * @param message mensaje que arroja la excepción
     */
    public MyException(String message){super(message);}

    /**
     * Método MyException
     * Permite mostrar el mesanje en especifico, ademas de la excepción como tal
     * @param message  mensaje que arroja la excepción
     * @param exception del error que se ha presentado
     */
    public MyException(String message, Exception exception){super(message,exception);}
}
