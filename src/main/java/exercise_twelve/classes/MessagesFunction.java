package exercise_twelve.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 12 con POO");}

    public void getWordOne(){
        logger.info("Ingrese la primera palabra: ");
    }

    public void getWordTwo(){
        logger.info("Ingrese la segunda palabra: ");
    }

    public void showWordEquals(){
        logger.info("Las palabras son Iguales ");
    }

    public void showWordNoEquals(){
        logger.info("Las palabras No son Iguales ");
    }

    public void showWords(String firstWord, String secondWord){
        logger.info("Primera palabra: "+firstWord+" - Segunda palabra: "+secondWord);
    }

}
