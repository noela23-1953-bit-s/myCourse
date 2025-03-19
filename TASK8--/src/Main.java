//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car Sedan = new Sed("Mercedes E-class", 120000.0, 7);
        Car Electric = new ElectricCar("Tesla model 3", 510000.0, 85);
        Car SportCar = new SportsCar("Ferrari F8", 37000.0, 420);
        Car[] cars = new Car[]{Sedan, Electric, SportCar};
        Car[] var5 = cars;
        int var6 = cars.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Car car = var5[var7];
            car.showDetails();
            car.startEngine();
            System.out.println();
        }

    }
}

