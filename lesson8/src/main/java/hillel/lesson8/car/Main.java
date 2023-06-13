package hillel.lesson8.car;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(250, "Nvidia");
        Car car = new Car("BMW", "black", motor, 2020);
        car.printCarCharacteristic();
        System.out.println("____________");
        System.out.println(car.motor);
    }
}
