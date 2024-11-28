package org.example.Modelos;

public class JsonTest {
    private int id;
    private String description;

    public JsonTest() {
    }

    public JsonTest(String description, int id) {
        this.description = description;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "JsonTest{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
