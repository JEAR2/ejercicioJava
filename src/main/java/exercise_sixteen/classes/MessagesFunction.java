package exercise_sixteen.classes;

import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 16 con POO");}

    public void getNamePerson(){logger.info("Ingrese su Nombre");}

    public void getAgePerson(){logger.info("Ingrese su Edad");}

    public void getSexPerson(){logger.info("Ingrese su Sexo");}

    public void getWeightPerson(){logger.info("Ingrese su Peso");}

    public void getHeightPerson(){logger.info("Ingrese su Altura");}

    public void showIdealWeight(String name){logger.info(name+" Está en su peso Ideal ");}

    public void showPastWeight(String name){logger.info(name+" Tiene Sobrepeso ");}

    public void showLightWeight(String name){logger.info(name + " Está por debajo de su peso ideal ");}

    public void showIsAdult(String name){logger.info(name +" es mayor de edad ");}

    public void showIsNotAdult(String name){logger.info(name+" No es mayor de edad ");}

    public void showMessage(String message){logger.info(message);}

}
