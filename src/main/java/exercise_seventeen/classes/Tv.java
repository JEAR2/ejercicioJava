package exercise_seventeen.classes;

/**
 * Clase Tv
 * Está clase contiene la información solicitada por el ejercicio para un Televisor
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */
public class Tv extends Appliance{
    private final double resolution;
    private final boolean tunerTdt;

    /**
     * Constructor vacio con valores por defecto de la clase Tv
     */
    public Tv() {
        this.resolution=20;
        this.tunerTdt = false;
    }

    /**
     * Constructor que recibe precio, peso y demás valores por defecto
     * @param priceBase precio base
     * @param weight peso
     */
    public Tv(double priceBase, double weight) {
        super(priceBase, weight);
        this.resolution=20;
        this.tunerTdt = false;
    }

    /**
     * Contructor de la clase Tv con todos los atributos
     * @param resolution resolucion en pulgadas
     * @param tunerTdt Sincronizador TDT
     * @param price Precio
     * @param color Color
     * @param energyConsumption Consumo energético
     * @param weight peso
     */
    public Tv( double resolution, boolean tunerTdt,double price, String color,char energyConsumption, double weight) {
        super(price,color,energyConsumption,weight);
        this.resolution = resolution;
        this.tunerTdt = tunerTdt;
    }

    /**
     * Método getResolution()
     * Permite obtener el valor de la resolución del televisor
     * @return resolución
     */
    public double getResolution() {
        return resolution;
    }

    /**
     * Método isTunerTdt()
     * Permite validar si el televisor cuenta con sincronizador tdt
     * @return valor almacenado para el televisor
     */
    public boolean isTunerTdt() {
        return tunerTdt;
    }

    /**
     * Método finalPrice()
     * Permite calcular el precio final del televisor con base en lo estipulado en la clase Appliance y
     * la resolución del televisor  y si cuenta o no con sincronizador tdt
     * @return precio final
     */
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
