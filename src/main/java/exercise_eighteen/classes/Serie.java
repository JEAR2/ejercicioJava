package exercise_eighteen.classes;

import exercise_eighteen.interfaces.Delivered;

/**
 * Clase Serie
 * Está clase contiene la información solicitada por el ejercicio para un Serie
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */
public class Serie implements Delivered {
    private String title;
    private int numberOfSeasons;
    private boolean delivered;
    private String gender;
    private String creator;

    /**
     * Constructor vacio con valores por defecto de la clase Serie
     */
    public Serie() {
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.title = "";
        this.gender = "";
        this.creator = "";
    }

    /**
     * Constructor que recibe titulo, creador y demás valores por defecto
     * @param title titulo de la serie
     * @param creator creador de la serie
     */
    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.gender = "";
    }

    /**
     * Contructor de la clase Serie con todos los atributos
     * @param title titulo de la serie
     * @param numberOfSeasons cantidad de temporadas
     * @param gender genero
     * @param creator creador
     */
    public Serie(String title, int numberOfSeasons, String gender, String creator) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.gender = gender;
        this.creator = creator;
    }

    /**
     * Método getTitle()
     * Permite obtener el valor del titulo de la serie
     * @return titulo de la serie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método setTitle(String title)
     * Permite asignar el titulo de la serie
     * @param title titulo de la serie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método getNumberOfSeasons()
     * Permite obtener la cantidad de temporadas de la serie
     * @return cantidad de temporadas de la serie
     */
    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    /**
     * Método setNumberOfSeasons(int numberOfSeasons)
     * Permite asignar la cantidad de temporadas a la serie
     * @param numberOfSeasons cantidad de temporadas de la serie
     */
    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    /**
     * Método getGender()
     * Permite obtener el genero de la serie
     * @return genero
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método setGender(String gender)
     * Permite asignar el valor del genero de la serie
     * @param gender genero
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Método getCreator()
     * Permite obtener el creador de la serie
     * @return creador de la serie
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Método setCreator(String creator)
     * Permite asignar el creador de la serie
     * @param creator creador de la serie
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Método toString()
     * Permite visualizar los datos de la serie
     * @return datos de la serie
     */
    @Override
    public String toString(){
        return "SERIE \nTitulo: " + getTitle() + "\nTemporadas: "+getNumberOfSeasons()+"\nEntregado: "+isDelivered()+"" +
                "\nGenero: "+getGender()+"\nCreador: "+getCreator();
    }

    /**
     * Método deliver()
     * Cambia el estado de this.delivered a true (prestado)
     * */
    @Override
    public void deliver() {
        this.delivered = true;
    }

    /**
     * Método toReturn()
     * Cambia el valor de this.derivered a false (No prestado)
     */
    @Override
    public void toReturn() {
        this.delivered = false;
    }

    /**
     * Método isDelivered()
     * Permite obtener el valor de this.delicered para conocer si la serie está presntada o no
     * @return valor de this.delivered
     */
    @Override
    public boolean isDelivered() {
        return this.delivered;
    }

    /**
     * Método compareTo(Object object)
     * Comnpara si una serie tiene mas temporadas que otra serie
     * @param object serie
     * @return resul con valores de acuerdo a las condiciones dadas
     */
    @Override
    public int compareTo(Object object) {
        Serie serie = (Serie) object;
        int status = -1;
        if(this.numberOfSeasons == serie.getNumberOfSeasons()){
            status = 0;
        } else if (this.numberOfSeasons > serie.getNumberOfSeasons()) {
            status = 1;
        }
        return status;
    }



}
