package hillel.lesson8.car;

public class Motor {
    int horsePower;
    String brandName;

    public Motor(int horsePower, String brandName) {
        this.horsePower = horsePower;
        this.brandName = brandName;
    }

    public String printMotor() {
        return " horsePower:" + horsePower + " brandName: " + brandName +";";
    }
}
