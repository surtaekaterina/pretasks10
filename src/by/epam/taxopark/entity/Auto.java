package by.epam.taxopark.entity;


public class Auto {
    private int id;
    private String mark;
    private double engineCapacity;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Auto() {

    }

    public Auto(int id, String mark, double engineCapacity, String color) {

        this.id = id;
        this.mark = mark;
        this.engineCapacity = engineCapacity;
        this.color = color;

    }

    @Override
    public String toString() {

        return "Auto [id=" + id + ", mark=" + mark + ", engineCapacity=" + engineCapacity + ", color=" + color + "]";
    }

}
