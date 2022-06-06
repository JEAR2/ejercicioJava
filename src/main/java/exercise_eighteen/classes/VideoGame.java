package exercise_eighteen.classes;

import exercise_eighteen.interfaces.Delivered;


public class VideoGame  implements Delivered {
    private String title;
    private int estimatedHours;
    private boolean delivered;
    private String gender;
    private String company;

    public VideoGame() {
        this.estimatedHours = 10;
        this.delivered = false;
        this.title = "";
        this.gender="";
        this.company = "";
    }

    public VideoGame(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = false;
        this.gender="";
        this.company = "";
    }

    public VideoGame(String title, int estimatedHours, String gender, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = gender;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString(){
        return "VIDEOJUEGO \nTitulo: " + getTitle() + "\nHoras Estimadas: "+getEstimatedHours()+"\nEntregado: "+isDelivered()+"" +
                "\nGenero: "+getGender()+"\nCompañia: "+getCompany();
    }

    @Override
    public void deliver() {
        this.delivered = true;
    }

    @Override
    public void toReturn() {
        this.delivered = false;
    }

    @Override
    public boolean isDelivered() {
        return this.delivered;
    }

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
