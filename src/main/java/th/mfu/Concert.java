package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes

    private int id;
    private String title;
    private String performer;
    private String date;
    private String description;

    public Concert() {
        id = 0;
        title = "";
        performer = "";
        date = "";
        description = "";
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this();
        this.title = title;
        this.description = description;
    }
 
    //TODO: add getters and setters for all attributes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // You can use Source action/generate getter setter function
    @Override
    public String toString() {
        return "Concert [id=" + id + ", title=" + title + ", performer=" + performer + ", date=" + date + ", description=" + description + "]";
    }
}
