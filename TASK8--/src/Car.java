public abstract class Car {
    String brand;
    double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public abstract void displayDetails();

    public void startEngine() {
        System.out.println(this.brand + " Engine started");
    }
}