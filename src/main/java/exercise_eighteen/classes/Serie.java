package exercise_eighteen.classes;

import exercise_eighteen.interfaces.Delivered;


public class Serie implements Delivered {
    private String title;
    private int numberOfSeasons;
    private boolean delivered;
    private String gender;
    private String creator;

    public Serie() {
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.title = "";
        this.gender = "";
        this.creator = "";
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.gender = "";
    }

    public Serie(String title, int numberOfSeasons, String gender, String creator) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.gender = gender;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString(){
        return "SERIE \nTitulo: " + getTitle() + "\nTemporadas: "+getNumberOfSeasons()+"\nEntregado: "+isDelivered()+"" +
                "\nGenero: "+getGender()+"\nCreador: "+getCreator();
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
