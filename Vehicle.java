public class Vehicle{
    private String name;
    private String model;
    private double price;

    public Vehicle(String name, String model, double price){
        super();
        this.name = name;
        this.model = model;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Vehicle [model=" + model + ", name=" + name + ", price=" + price + "]";
    }
}