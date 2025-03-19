public class Sedan extends Car {
        
        int seatingCapacity;

        public Sedan(String brand, double price, int seatingCapacity) {
            super(brand, price);
            this.seatingCapacity = seatingCapacity;
        }

        public void displayDetails() {
            System.out.println("The car type is Sedan:" + this.brand + ",The price is: $" + this.price + ",The seats are:" + this.seatingCapacity);
        }
    }


