public abstract class Car {
   protected String brand;
    double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

   

    public void startEngine() {
        System.out.println(this.brand + " Engine started");
    }
}
