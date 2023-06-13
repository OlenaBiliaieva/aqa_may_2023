package hillel.lesson8.glass;

public class Main2 {

    public static void main(String[] args) {
        Glass glass1 = new Glass(250, "red", "glass" , 12);
        glass1.fillGlass(300);
        glass1.fillGlass(240);
        glass1.keepWater();
        glass1.printVolume();
        glass1.keepWater(250);

    }
}
