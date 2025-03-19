public class ElectricCar extends Car{
        int batteryCapacity;

        public ElectricCar(String brand, double price, int batteryCapacity) {
            super(brand, price);
            super.batteryCapacity = batteryCapacity;
        }

        public void displayDetails() {
            System.out.println("The fuel type Car is Electric Car:" + this.brand + ",The price is:$" + this.price + ",The battery is:" + this.batteryCapacity + "kwh");
        }
    }

