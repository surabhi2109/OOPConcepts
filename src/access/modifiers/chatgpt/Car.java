package access.modifiers.chatgpt;

//Design a class `Car` with private data members `make`, `model`, `year`, and `price`. Implement public methods to get and set these details. Additionally, implement a method to calculate the depreciation of the car based on its age and price.

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDepreciationCost(){
        return (this.price - (this.price * 0.1 * (2023-this.year)));
    }
}
