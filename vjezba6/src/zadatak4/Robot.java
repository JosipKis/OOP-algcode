package zadatak4;

import java.util.Map;
import java.util.Set;

public class Robot {

    private int id;
    private String description;

    public Robot(String description, int id){
        this.description = description;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
