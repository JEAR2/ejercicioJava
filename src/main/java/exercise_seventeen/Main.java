package exercise_seventeen;

import exercise_seventeen.classes.Appliance;
import exercise_seventeen.classes.MessagesFunction;
import exercise_seventeen.classes.Tv;
import exercise_seventeen.classes.WashingMachine;


public class Main {
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();
    public static void main(String[] args) {
        init();
    }
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

        for (int i = 0; i < appliances.length; i++) {
            messagesFunction.showFinalPrice(i+1,appliances[i].finalPrice());
        }

        int sumAppliances = 0;
        int sumWashing = 0;
        int sumTv = 0;

        for (Appliance element : appliances) {
            if (element != null) {
                sumAppliances += element.finalPrice();
            }
            if (element instanceof WashingMachine) {
                sumWashing += element.finalPrice();
            }
            if (element instanceof Tv) {
                sumTv += element.finalPrice();
            }
        }

        messagesFunction.showPriceAppliance(sumAppliances);
        messagesFunction.showPriceWashing(sumWashing);
        messagesFunction.showPriceTv(sumTv);

    }
}
