package exercise_sixteen.classes;

import org.jboss.logging.Logger;

/**
 * Clase MessagesFunction
 * Esta clase permite mostrar los mensajes que son invocados por métodos para mostrar información al usuario
 *
 * Autor
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-05/06/22
 */
public class MessagesFunction {

    /**
     * Se crea una instancia de la clase logger, la cual permite mostrar mensajes en pantalla
     */
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    /**
     * Método getIntance
     * Crea una instancia de la clase MessageFunction
     * @return una instancia de la clase
     */
    public static MessagesFunction getInstance(){return new MessagesFunction();}

    /**
     * Método showWelcome()
     * Permite mostrar un mensaje de bienvenida
     */
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 16 con POO");}

    /**
     * Método getNamePerson()
     * Permite mostrar en pantalla un mensaje indicando al usuario que debe ingresar un nombre
     */
    public void getNamePerson(){logger.info("Ingrese un Nombre");}

    /**
     * Método getAgePerson()
     * Permite mostrar en pantalla un mensaje indicando al usuario que debe ingresar una edad
     */
    public void getAgePerson(){logger.info("Ingrese una Edad");}

    /**
     * Método getSexPerson()
     * Permite mostrar en pantalla un mensaje indicando al usuario que debe ingresar un sexo
     */
    public void getSexPerson(){logger.info("Ingrese un Sexo");}

    /**
     * Método getWeightPerson()
     * Permite mostrar en pantalla un mensaje indicando al usuario que debe ingresar un peso
     */
    public void getWeightPerson(){logger.info("Ingrese un Peso");}

    /**
     * Método getHeightPerson()
     * Permite mostrar en pantalla un mensaje indicando al usuario que debe ingresar una altura
     */
    public void getHeightPerson(){logger.info("Ingrese un Altura");}

    /**
     * Método showIdealWeight(String name)
     * Permite mostrar el usuario un mensaje si está en su peso ideal
     * @param name nombre del usuario
     */
    public void showIdealWeight(String name){logger.info(name+" Está en su peso Ideal ");}

    /**
     * Método showPastWeight(String name)
     * Permite mostrar el usuario un mensaje si tiene sobrepeso
     * @param name nombre del usuario
     */
    public void showPastWeight(String name){logger.info(name+" Tiene Sobrepeso ");}

    /**
     * Método showLightWeight(String name)
     * Permite mostrar el usuario un mensaje si está por debajo del peso ideal
     * @param name nombre del usuario
     */
    public void showLightWeight(String name){logger.info(name + " Está por debajo de su peso ideal ");}

    /**
     * Método showIsAdult(String name)
     * Permite mostrar en pantalla si el usuario es mayor de edad
     * @param name nombre del usuario
     */
    public void showIsAdult(String name){logger.info(name +" es mayor de edad ");}

    /**
     * Método showIsNotAdult(String name)
     * Permite mostrar en pantalla si el usuario es mayor de edad
     * @param name nombre del usuario
     */
    public void showIsNotAdult(String name){logger.info(name+" No es mayor de edad ");}

    /**
     * Método showMessage(String message)
     * permite mostrar en pantalla en mensaje indicado por parametro
     * @param message mensaje para mostrar
     */
    public void showMessage(String message){logger.info(message);}

}
