package web.models;
import java.util.ArrayList;

public class Cars {
    private int number;
    private String brand;
    private String model;

    public Cars() {
    }

    public Cars(int number, String brand, String model) {
        this.number = number;
        this.brand = brand;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return number +
                "-" + brand + "-" + model ;
    }
}
