package exercise_seventeen.classes;

import java.util.HashMap;
/**
 * Clase Appliance
 * Está clase contiene la información solicitada por el ejercicio para un Electrodomestico
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */
public class Appliance {

    private double priceBase;
    private String color;
    private char energyConsumption;
    private double weight;

    private final String[] colors = {"blanco", "negro", "rojo", "azul", "gris"};

    /**
     * Constructor vacio con valores por defecto de la clase Appliance
     */
    public Appliance() {
        this.weight=5;
        this.priceBase=100;
    }

    /**
     * Constructor que recibe precio, peso y demás valores por defecto
     * @param priceBase precio base del electrodomestico
     * @param weight peso del electrodomestico
     */
    public Appliance(double priceBase, double weight) {
        this.priceBase = priceBase;
        this.weight = weight;
        this.weight=5;
        this.priceBase=100;
    }

    /**
     * Contructor de la clase Persona con todos los atributos
     * @param priceBase precio base del electrodomestico
     * @param color colo del electrodomestico
     * @param energyConsumption consumo energético del electrodomestico
     * @param weight peso del electrodomestico
     */
    public Appliance(double priceBase, String color, char energyConsumption, double weight) {
        this.priceBase = priceBase;
        checkColor(color);
        checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }

    /**
     * Método getPriceBase()
     * Permite obtener el precio base del electrodomestico
     * @return precio base
     */
    public double getPriceBase() {
        return priceBase;
    }

    /**
     * Método getColor()
     * Permite obtener el color del electrodomestico
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *  Método getEnergyConsumption()
     *  Permite obtener el consumo energitico del electrodomestico
     * @return consumo energitico
     */
    public char getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * Método getWeight()
     * Permite obtener el peso del electrodomestico
     * @return peso
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Método checkEnergyConsumption(char word)
     * Permite verificar si el consumo energitico ingresado por el usuario es valida
     * de lo contrario asigna 'F' por defecto
     * @param word consumo energetico inrgesado por el usuario
     */
    private void checkEnergyConsumption(char word){
        if(word=='A' || word=='B' || word=='C' || word=='D' || word=='E' || word=='F'){
            this.energyConsumption = word;
        }else{
            this.energyConsumption='F';
        }
    }

    /**
     * Método checkColor(String color)
     * Permite recibiendo el color ingresado por el usuario valiar se es un color valido
     * de lo contrario asigna 'blanco' como valor por defecto
     * @param color ingresado por el usuario
     */
    private void checkColor(String color){
        color = color.toLowerCase();
        if(color.equals("blanco") ||  color.equals("negro") || color.equals("rojo")
                ||  color.equals("azul") ||  color.equals("gris")){
            this.color = color;
        }else {
            this.color = colors[0];
        }
    }

    /**
     * Método finalPrice()
     * Permite calcular el valor final del precio del electrodomestico de acuerdo con las
     * condiciones dadas por el ejercicio segun consumo energitico y peso del mismo
     * @return precio final
     */
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
