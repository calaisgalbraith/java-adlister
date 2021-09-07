package javabeans;

import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String first_name;
    private String last_name;

    public Author(int id, String first_name, String lat_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = lat_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLat_name(String lat_name) {
        this.last_name = lat_name;
    }
}
