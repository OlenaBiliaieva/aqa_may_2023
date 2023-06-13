package lesson7.arrays;


import lesson7.arrays.ArrayHelper;

public class MethodExample {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 18, 67};
        long[] arr2 = {6, 10, 95, 47, 7};
        int u = 10;
        ArrayHelper.printArray(arr);
        System.out.println("__________");
        ArrayHelper.printArray(arr2);
        int p = ArrayHelper.getArrayValueSum(9, arr);


        System.out.println(ArrayHelper.getArrayValueSum(arr, 0));
        System.out.println(ArrayHelper.getArrayValueSum(9, arr));


    }
}
