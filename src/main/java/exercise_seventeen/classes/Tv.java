package exercise_seventeen.classes;

public class Tv extends Appliance{
    private double resolution;
    private boolean tunerTdt;

    public Tv() {
        this.resolution=20;
        this.tunerTdt = false;
    }

    public Tv(double priceBase, double weight) {
        super(priceBase, weight);
        this.resolution=20;
        this.tunerTdt = false;
    }

    public Tv( double resolution, boolean tunerTdt,double price, String color,char energyConsumption, double weight) {
        super(price,color,energyConsumption,weight);
        this.resolution = resolution;
        this.tunerTdt = tunerTdt;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isTunerTdt() {
        return tunerTdt;
    }

    @Override
    public double finalPrice() {
        double price = super.finalPrice();
        if(this.resolution>40){
            price = price + price*0.3;
        }
        if(this.tunerTdt){
            price+=50;
        }
        return price;
    }
}
