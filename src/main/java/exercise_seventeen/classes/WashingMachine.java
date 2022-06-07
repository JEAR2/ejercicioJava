package exercise_seventeen.classes;
/**
 * Clase WashingMachine
 * Está clase contiene la información solicitada por el ejercicio para una Lavadora
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */
public class WashingMachine extends Appliance{
    private final int load;

    /**
     * Constructor vacio con valores por defecto de la clase WashingMachine
     */
    public WashingMachine() {
        this.load = 5;
    }

    /**
     * Constructor que recibe precio, peso y demás valores por defecto
     * @param priceBase precio
     * @param weight peso
     */
    public WashingMachine(double priceBase, double weight) {
        super(priceBase, weight);
        this.load = 5;
    }

    /**
     * Contructor de la clase WashingMachine y todos los atributos
     * @param load carga
     * @param price precio
     * @param color color
     * @param energyConsumption consumo energético
     * @param weight peso
     */
    public WashingMachine(int load,double price, String color,char energyConsumption, double weight) {
        super(price,color,energyConsumption,weight);
        this.load = load;

    }

    /**
     * Método getLoad()
     * Permite obtener el valor de la carga de la lavadora
     * @return carga
     */
    public int getLoad() {
        return load;
    }

    /**
     * Método finalPrice()
     * Permite calcular el precio final de la lavadora con base en lo estipulado en la clase Appliance y
     * la carga de la lavadora
     * @return precio final
     */
    @Override
    public double finalPrice() {
        double price = super.finalPrice();
        if(this.load>30){
            price+=50;
        }
        return price;
    }
}
