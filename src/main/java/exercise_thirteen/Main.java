package exercise_thirteen;


import exercise_thirteen.classes.MessagesFunction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static  MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public static void main(String[] args) {
        init();
    }

    public static void init(){
        messagesFunction.showWelcome();
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String dateFormat = date.format(format);
        messagesFunction.showDate(date);
        messagesFunction.showDateFormat(dateFormat);
    }
}
