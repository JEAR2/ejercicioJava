package exercise_sixteen.classes;


import exercise_sixteen.interfaces.IExerciseSixteen;

import java.util.Random;

/**
 * Clase Person
 * Está clase contiene la informació solicitada por el ejercicio para la persona
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */
public class Person implements IExerciseSixteen {
    /**
     * Se crea una instancia de la clase Person
     * @return la instancia creada
     */
    public static Person getInstance(){return new Person();}

    private final Random random = new Random();
    private String name;
    private int age;
    private final Integer dni= generateDNI();
    private String sex;
    private Double weight;
    private Double height;

    /**
     * Constructor vacio con valores por defecto de la calse Person
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.sex = "H";
        this.weight = 0.0;
        this.height = 0.0;
    }

    /**
     * Constructor que recibe nombre, edad, sexo y demás valores por defecto
     * @param name nombre de la persona
     * @param age edad de la persona
     * @param sex sexo de la persona
     */
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = 0.0;
        this.height = 0.0;
    }

    /**
     * Contructor de la clase Perosna con todos los atributos
     * @param name nombre de la persona
     * @param age edad de la persona
     * @param sex sexo de la persona
     * @param weight peso de la persona
     * @param height altura de la persona
     */
    public Person(String name, int age, String sex, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    /**
     * Método getName()
     * para obtener el nombre de la persona
     * @return nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Método setName(String name)
     * Recibe y asigna el nombre la persona
     * @param name nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método getAge()
     * para obtener la edad de la persona
     * @return edad de la persona
     */
    public int getAge() {
        return age;
    }

    /**
     * Método setAge(String age)
     * Recibe y asigna la edad de la persona
     * @param age edad de la persona
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Método getDNI()
     * para obtener el dni de la persona
     * @return dni de la persona
     */
    public Integer getDNI() {
        return dni;
    }

    /**
     * Método getSex()
     * para obtener el sexo de la persona
     * @return sexo de la persona
     */
    public String getSex() {
        return sex;
    }

    /**
     * Método setSex(String sex)
     * Recibe y asigna el sexo de la persona
     * @param sex sexo de la persona
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Método getWeight()
     * para obtener el peso de la persona
     * @return peso de la persona
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Método setWeight(String weight)
     * Recibe y asigna el peso  de la persona
     * @param weight peso de la persona
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * Método getHeight()
     * para obtener la altura de la persona
     * @return altura de la persona
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Método setHeight(String height)
     * Recibe y asigna la altura  de la persona
     * @param height altura de la persona
     */
    public void setHeight(Double height) {
        this.height = height;
    }


    /**
     * método calculateIMC()
     * Permite calcular el Indice de Masa Corporal de cada persona creada con esta clase
     * @return valor que indica si esta o no en el peso ideal
     */
    public int calculateIMC(){
        double imc;
        int result;
        imc = getWeight()/Math.pow(getHeight(),2);
        if(imc<20){
            result = -1;
        }else if(imc>=20 && imc<=25){
            result = 0;
        }else{
            result = 1;
        }
        return result;
    }

    /**
     * Método isAdult()
     * Permite saber si el usuario es o no mayor de edad
     * @return valor indicando si el usuario es o no mayor de edad
     */
    public Boolean isAdult(){
        Boolean result=Boolean.TRUE;
        if(getAge()<18){
            result = Boolean.FALSE;
        }
        return result;
    }

    /**
     * Método checkSex()
     * Permite validar si el valor del sexo introducido por es usuaio es valido
     * de lo contrario asigna 'F' por default
     */
    public void checkSex(){
        if(getSex().equals("M") || getSex().equals("H")){
            setSex(getSex());
        }else{
            setSex("H");
        }
    }

    /**
     * Método toString()
     * Permite mostrar en pantalla la información del usuario
     * @return información del usuario
     */
    public String toString(){
        return "Nombre: "+getName()+" \nEdad: "+getAge()+" \nDNI: "+getDNI()+" \nSexo: "+getSex()+" \nPeso: "+getWeight()+"" +
                "\n Altura: "+getHeight()+" \n";
    }

    /**
     * Método generateDNI()
     * Permite generar un valor aleatrio formado por 8 digitos para ser asignado como DNI de la persona
     * @return código DNI
     */
    private int generateDNI(){
        return this.random.nextInt(99999999 + 10000000) + 10000000;
    }


}
