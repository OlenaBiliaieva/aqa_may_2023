package hillel.lesson8.car;

public class Car {

    String brand;

    String color;

    Motor motor;

    int yearOfProduction;

    public Car(String brand, String color, Motor motor, int yearOfProduction) {
        this.brand = brand;
        this.color = color;
        this.motor = motor;
        this.yearOfProduction = yearOfProduction;
    }

    public void printCarCharacteristic() {
        System.out.println("brand :" + brand + " color:" + color + " motor : " + motor.printMotor() + " yearOfProduction:" + yearOfProduction);
    }
}
