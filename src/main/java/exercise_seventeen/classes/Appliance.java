package exercise_seventeen.classes;

import java.util.HashMap;

public class Appliance {

    private double priceBase;
    private String color;
    private char energyConsumption;
    private double weight;

    private final String[] colors = {"blanco", "negro", "rojo", "azul", "gris"};

    public Appliance() {
        this.weight=5;
        this.priceBase=100;
    }

    public Appliance(double priceBase, double weight) {
        this.priceBase = priceBase;
        this.weight = weight;
        this.weight=5;
        this.priceBase=100;
    }

    public Appliance(double priceBase, String color, char energyConsumption, double weight) {
        this.priceBase = priceBase;
        checkColor(color);
        checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }

    public double getPriceBase() {
        return priceBase;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    private void checkEnergyConsumption(char word){
        if(word=='A' || word=='B' || word=='C' || word=='D' || word=='E' || word=='F'){
            this.energyConsumption = word;
        }else{
            this.energyConsumption='F';
        }
    }

    private void checkColor(String color){
        color = color.toLowerCase();
        if(color.equals("blanco") ||  color.equals("negro") || color.equals("rojo")
                ||  color.equals("azul") ||  color.equals("gris")){
            this.color = color;
        }else {
            this.color = colors[0];
        }
    }


    public double finalPrice(){
        double finalPrice = this.priceBase;
        HashMap<Character, Integer> pricesConsumption = new HashMap<>();
        pricesConsumption.put('A', 100);
        pricesConsumption.put('B', 80);
        pricesConsumption.put('C', 60);
        pricesConsumption.put('D', 50);
        pricesConsumption.put('E', 30);
        pricesConsumption.put('F', 10);
        finalPrice += Integer.parseInt(pricesConsumption.get(this.energyConsumption).toString());

        if(this.weight >= 0 && this.weight <= 19){
            finalPrice += 10;
        } else if (this.weight >= 20 && this.weight <= 49) {
            finalPrice += 50;
        }else if (this.weight >= 50 && this.weight <= 79) {
            finalPrice += 80;
        }else {
            finalPrice += 100;
        }
        return finalPrice;
    }

}
