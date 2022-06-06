package exercise_sixteen.classes;


import java.util.Random;

public class Person  {

    public static Person getInstance(){return new Person();}

    private final Random random = new Random();
    private String name = "";
    private int age = 0;
    private final Integer dni= generateDNI();
    private String sex = "H";
    private Double weight = 0.0;
    private Double height = 0.0;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, int age, String sex, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getDNI() {
        return dni;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * Métodos
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

    public Boolean isAdult(){
        Boolean result=Boolean.TRUE;
        if(getAge()<18){
            result = Boolean.FALSE;
        }
        return result;
    }

    public void checkSex(){
        if(getSex().equals("M") || getSex().equals("H")){
            setSex(getSex());
        }else{
            setSex("H");
        }
    }

    public String toString(){
        return "Nombre: "+getName()+" \nEdad: "+getAge()+" \nDNI: "+getDNI()+" \nSexo: "+getSex()+" \nPeso: "+getWeight()+"" +
                "\n Altura: "+getHeight()+" \n";
    }

    private int generateDNI(){
        return this.random.nextInt(99999999 + 10000000) + 10000000;
    }


}
