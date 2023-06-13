package hillel.lesson8.glass;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        Glass glass1 = new Glass(250, "red", "glass");

        //by link
        changeGlassVolume(glass1);
        System.out.println(glass1.volume);


        System.out.println("____X____");
        //by value
        printX(x);
        System.out.println(x);

    }

    public static void printX(int x) {
        x = 12;
        System.out.println(x);
    }

    public static void changeGlassVolume(Glass g) {
        g.volume = 300;
    }


}