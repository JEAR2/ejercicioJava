package exercise_sixteen;


import exercise_sixteen.classes.MessagesFunction;
import exercise_sixteen.classes.Person;
import exercise_sixteen.classes.ScannerExerciseSixteen;

public class Main {
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    static ScannerExerciseSixteen scannerExerciseSixteen = ScannerExerciseSixteen.getInstance();
    static Person person = Person.getInstance();
    public static void main(String[] args) {
        init();
    }
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

    private static void isAdult(String name,boolean resul){
        if(resul){
            messagesFunction.showIsAdult(name);
        }else{
            messagesFunction.showIsNotAdult(name);
        }
    }

}
