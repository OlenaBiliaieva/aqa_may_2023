package hillel.lesson8.glass;

public class Main1 {
    public static void main(String[] args) {
        Glass glass1 = new Glass(250, "red", "glass");
        Glass glass2 = glass1;

        glass2.volume = 300;
        System.out.println(glass1.volume);

        /// Reloud constructor
        Glass glass3 = new Glass(250, "red");

        System.out.println("volume: " + glass3.volume + " color : " + glass3.color + " mather:" + glass3.mather);

        Glass glass4 = new Glass("red","glass");
        System.out.println("volume: " + glass4.volume + " color : " + glass4.color + " mather:" + glass4.mather);

    }
}
