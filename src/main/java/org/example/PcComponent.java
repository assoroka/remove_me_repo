package org.example;
import static java.lang.System.out;
public abstract class PcComponent {
    private String brand;
    private String model;
    private double price;
    private int powerRequirement;

    public PcComponent(String brand, String model, double price, int powerRequirement) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.powerRequirement = powerRequirement;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getPowerRequirement() {
        return powerRequirement;
    }

    public void setPowerRequirement(int powerRequirement) {
        this.powerRequirement = powerRequirement;
    }

    public void displayInformation() {
        out.println("Компонент: " + brand + " " + model + ", Ціна: " + price + " USD");
    }

    public abstract void connect();
}
