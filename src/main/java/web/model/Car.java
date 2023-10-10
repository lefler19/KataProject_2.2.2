package web.model;

public class Car {

    private String  model;
    private String color;
    private int price;
    public Car() {}
    public Car(String  model, String color, int price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
