package lesson7.arrays;

public class ArrayHelper {

    public static void printArray(int[] arr) {
        for (int p : arr) {
            System.out.println(p);
        }
    }

    public static int getArrayValueSum(int[] arr) {
        int x = 0;
        for (int p : arr) {
            x += p;
        }
        return x;
    }

    public static void printArray(long[] arr) {
        for (long p : arr) {
            System.out.println(p);
        }
    }

    public static int getArrayValueSum(int[] arr, int x) {
        x = 0;
        for (int p : arr) {
            x += p;
        }
        return x;
    }
    public static int getArrayValueSum(int x, int[] arr) {
        for (int p : arr) {
            x += p;
        }
        return x;
    }
}
