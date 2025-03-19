public class SportsCar extends Car {
    int topSpeed;

    private SportsCar(String brand, double price, int topSpeed) {
        super(brand, price);
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed() {
        return topSpeed;
    }

    public void displayDetails() {
        System.out.println("The performance of the Car is a Sport Car:" + this.brand + ",The price is:$" + this.price + ",The top Speed is:" + this.topSpeed + "km/h");
    }
}

