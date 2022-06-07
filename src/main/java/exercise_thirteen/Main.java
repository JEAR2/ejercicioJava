package exercise_thirteen;


import exercise_thirteen.classes.MessagesFunction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class Main {
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    static  MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
    public static void init(){
        messagesFunction.showWelcome();
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String dateFormat = date.format(format);
        messagesFunction.showDate(date);
        messagesFunction.showDateFormat(dateFormat);
    }
}
