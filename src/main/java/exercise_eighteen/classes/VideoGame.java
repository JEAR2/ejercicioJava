package exercise_eighteen.classes;

import exercise_eighteen.interfaces.Delivered;

/**
 * Clase VideoGame
 * Está clase contiene la información solicitada por el ejercicio para un VideoGame
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Version: v1-05/06/22
 *
 */
public class VideoGame  implements Delivered {
    private String title;
    private int estimatedHours;
    private boolean delivered;
    private String gender;
    private String company;

    /**
     * Constructor vacio con valores por defecto de la clase VideoGame
     */
    public VideoGame() {
        this.estimatedHours = 10;
        this.delivered = false;
        this.title = "";
        this.gender="";
        this.company = "";
    }

    /**
     * Constructor que recibe titulo, cantidad de horas estimadas y demás valores por defecto
     * @param title titulo del vodeojuego
     * @param estimatedHours horas estimadas
     */
    public VideoGame(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = false;
        this.gender="";
        this.company = "";
    }

    /**
     * Contructor de la clase Tv con todos los atributos
     * @param title titulo del videojuego
     * @param estimatedHours cantidad de horas estimadas
     * @param gender genero del vodeojuego
     * @param company compañia
     */
    public VideoGame(String title, int estimatedHours, String gender, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = gender;
        this.company = company;
    }

    /**
     * Método getTitle()
     * Permite obtener el titulo del videojuego
     * @return titulo
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método setTitle(String title)
     * Permite asiganr el titulo del videojuego
     * @param title titulo
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método getEstimatedHours()
     * Permite obtener la cantidad de hoas estimadas para el videojuego
     * @return cantidad de horas estimadas
     */
    public int getEstimatedHours() {
        return estimatedHours;
    }

    /**
     * Método setEstimatedHours(int estimatedHours)
     * Permite asignar la cantidad de horas estimadas al videojuego
     * @param estimatedHours horas estimadas
     */
    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    /**
     * Método getGender()
     * Permite obtener el genero del videojuego
     * @return genero
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método setGender(String gender)
     * Permite asignar el genero del viedeojuego
     * @param gender genero
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Método getCompany()
     * Permite obtener la compañia asociada al videojuego
     * @return compañia
     */
    public String getCompany() {
        return company;
    }

    /**
     * Método setCompany(String company)
     * Permite asignar al videojuego la compañia asociada
     * @param company compañia
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Método toString()
     * Permite mostrar todos los datos del videojuego
     * @return datos del videojuego
     */
    @Override
    public String toString(){
        return "VIDEOJUEGO \nTitulo: " + getTitle() + "\nHoras Estimadas: "+getEstimatedHours()+"\nEntregado: "+isDelivered()+"" +
                "\nGenero: "+getGender()+"\nCompañia: "+getCompany();
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
     * Comnpara si un  videojuego tiene mas horas estimadas que otro videojuego
     * @param object videojuego
     * @return resul con valores de acuerdo a las condiciones dadas
     */
    @Override
    public int compareTo(Object object) {
        VideoGame videoGame = (VideoGame) object;
        int status = -1;
        if(this.estimatedHours == videoGame.getEstimatedHours()){
            status = 0;
        } else if (this.estimatedHours > videoGame.getEstimatedHours()) {
            status = 1;
        }
        return status;
    }


}
