package exercise_seventeen;


import exercise_seventeen.classes.Appliance;
import exercise_seventeen.classes.Function;
import exercise_seventeen.classes.Tv;
import exercise_seventeen.classes.WashingMachine;

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
     * Crea una instancia de la clase Function
     */
    static Function function = Function.getInstance();
    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
    public static void init(){
        Appliance[] appliances = new Appliance[10];
        WashingMachine washingMachineOne = new WashingMachine(30,125,"negro",'D',25);
        WashingMachine washingMachineTwo = new WashingMachine(5,60,"rojo",'A',250);
        WashingMachine washingMachineThree = new WashingMachine(35,150,"gris",'B',52);
        WashingMachine washingMachineFour = new WashingMachine(10,132,"verde",'F',35);
        WashingMachine washingMachineFive = new WashingMachine(1000,1250,"blanco",'E',56);

        Tv tvOne = new Tv(32,true,125,"negro",'A',25);
        Tv tvTwo = new Tv(14,false,75,"blanco",'D',15);
        Tv tvThree = new Tv(21,true,115,"gris",'D',20);
        Tv tvFour = new Tv(50,false,256,"rojo",'E',45);
        Tv tvFive = new Tv(24,true,160,"verde",'C',24);


        appliances[0] = washingMachineOne;
        appliances[1] = washingMachineTwo;
        appliances[2] = washingMachineThree;
        appliances[3] = washingMachineFour;
        appliances[4] = washingMachineFive;
        appliances[5] = tvOne;
        appliances[6] = tvTwo;
        appliances[7] = tvThree;
        appliances[8] = tvFour;
        appliances[9] = tvFive;

        function.calculatePrice(appliances);
        function.showAppliancesSum(appliances);


    }
}
