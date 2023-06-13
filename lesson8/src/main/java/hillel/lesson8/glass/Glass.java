package hillel.lesson8.glass;

public class Glass {
    int volume;
    String color;
    String mather;

    public Glass(int volume, String color, String mather) {
        this.volume = volume;
        this.color = color;
        this.mather = mather;
    }

    public Glass(String color, String mather) {
        this.color = color;
        this.mather = mather;
    }

    public Glass(int volume, String color, String mather, int j) {
        this.color = color;
        this.mather = mather;
        System.out.println(j);
    }

    public Glass(){}

    public Glass(int volume, String color){
        this.volume = volume;
        this.color = color;
    }

    public void printVolume(){
        System.out.println(volume);
    }

    public void keepWater() {
        System.out.println("Cтакан полон");
    }

    public void keepWater(int volume){
        fillGlass(volume);
        System.out.println("стакан хранит  " + volume);
    }

    public void fillGlass(int volume) {
        if (this.volume < volume) {
            System.out.println("Стакан переполнен");
        }
    }

}
