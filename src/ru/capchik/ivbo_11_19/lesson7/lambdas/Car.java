package ru.capchik.ivbo_11_19.lesson7.lambdas;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private int mileage;



    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public void addMileage(int mileage) {
        this.mileage += mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
