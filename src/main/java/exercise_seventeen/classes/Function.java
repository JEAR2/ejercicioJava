package exercise_seventeen.classes;

/**
 * Clase Function
 * Esta clase permite crear todas las funciones o métodos para ser invocados
 * desde cualquier clase del sistema para su funcionamineto
 *
 * Autor
 * John Edward Acevedo rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */

public class Function {
    /**
     * Método getIntance()
     * Crea una instancia de la clase Function
     * @return una intancia de la clase
     */
    public static Function getInstance(){return new Function();}

    /**
     * Se crea instancia de la clase MessagesFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    /**
     * Método calculatePrice(Appliance[] appliances)
     * Permite mostrar el precio de las electrodomestiocos
     * @param appliances arreglo con los electrodomesticos vendidos almacenados
     */
    public void calculatePrice(Appliance[] appliances){
        for (int i = 0; i < appliances.length; i++) {
            messagesFunction.showFinalPrice(i+1,appliances[i].finalPrice());
        }
    }

    /**
     * Método showAppliancesSum(Appliance[] appliances)
     * permite mostrar el valor de los electrodomesticos en total
     * ademas de los valores acumulados por cada tipo de electrodomestico
     * @param appliances arreglo con los electrodomesticos vendidos almacenados
     */
    public void showAppliancesSum(Appliance[] appliances){
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
