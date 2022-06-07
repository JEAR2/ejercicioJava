package exercise_sixteen;


import exercise_sixteen.classes.MessagesFunction;
import exercise_sixteen.classes.Person;
import exercise_sixteen.classes.ScannerExerciseSixteen;

/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-05/06/22
 */
public class Main {
    /**
     * Crea una instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    /**
     * Crea una instancia de la clase ScannerExerciseSixteen
     */
    static ScannerExerciseSixteen scannerExerciseSixteen = ScannerExerciseSixteen.getInstance();

    /**
     * Crea una instancia de la clase Person
     */
    static Person person = Person.getInstance();
    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
    public static void init(){
        messagesFunction.showWelcome();
        String name;
        int age;
        String sex;
        Double weight;
        Double height;
        messagesFunction.getNamePerson();
        name= scannerExerciseSixteen.getString();
        messagesFunction.getAgePerson();
        age = scannerExerciseSixteen.getInteger();
        messagesFunction.getSexPerson();
        sex = scannerExerciseSixteen.getString();
        messagesFunction.getWeightPerson();
        weight = scannerExerciseSixteen.getDouble();
        messagesFunction.getHeightPerson();
        height = scannerExerciseSixteen.getDouble();
        Person personOne = new Person(name,age,sex,weight,height);
        personOne.checkSex();
        Person personTwo = new Person(name,age,sex);
        personTwo.checkSex();
        Person personThree = person;
        personThree.setName("John");
        personThree.setAge(9);
        personThree.setSex("H");
        personThree.setWeight(55.0);
        personThree.setHeight(1.69);
        personThree.checkSex();

        checkIdealWeight(personOne.getName(),personOne.calculateIMC());
        checkIdealWeight(personTwo.getName(),personTwo.calculateIMC());
        checkIdealWeight(personThree.getName(),personThree.calculateIMC());

        isAdult(personOne.getName(),personOne.isAdult());
        isAdult(personTwo.getName(),personTwo.isAdult());
        isAdult(personThree.getName(),personThree.isAdult());

        messagesFunction.showMessage(personOne.toString());
        messagesFunction.showMessage(personTwo.toString());
        messagesFunction.showMessage(personThree.toString());

    }

    /**
     * Método checkIdealWeight(String name,Integer imc)
     * Permite mostrar en pantalla si la persona está o no en su peso ideal
     * @param name nombre de la persona
     * @param imc valor retornado del IMC (1,-1,0)
     */
    private static void checkIdealWeight(String name,Integer imc){
        if(imc.equals(-1)){
            messagesFunction.showLightWeight(name);
        }
        if(imc.equals(0)){
            messagesFunction.showIdealWeight(name);
        }
        if(imc.equals(1)){
            messagesFunction.showPastWeight(name);
        }
    }

    /**
     * Método isAdult(String name,boolean resul)
     * Permite mostar en pantalla si el usaurio es o no mayor de edad
     * @param name nombre de la persona
     * @param resul valor boolean que varifica si la persona es o no mayor de edad
     */
    private static void isAdult(String name,boolean resul){
        if(resul){
            messagesFunction.showIsAdult(name);
        }else{
            messagesFunction.showIsNotAdult(name);
        }
    }

}
