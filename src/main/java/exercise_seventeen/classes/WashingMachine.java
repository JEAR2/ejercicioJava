package exercise_seventeen.classes;

public class WashingMachine extends Appliance{
    private int load = 5;

    public WashingMachine() {
    }

    public WashingMachine(double priceBase, double weight) {
        super(priceBase, weight);
    }

    public WashingMachine(int load,double price, String color,char energyConsumption, double weight) {
        super(price,color,energyConsumption,weight);
        this.load = load;

    }

    public int getLoad() {
        return load;
    }

    @Override
    public double finalPrice() {
        double price = super.finalPrice();
        if(this.load>30){
            price+=50;
        }
        return price;
    }
}
