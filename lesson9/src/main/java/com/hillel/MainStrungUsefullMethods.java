package com.hillel;

public class MainStrungUsefullMethods {

    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(arr);

        char c = str.charAt(0);
        char c1 = arr[0];
//        System.out.println(c);
//        System.out.println(c1);

        String str1 = "Hello";
        String str2 = new String("Hello");
//        System.out.println(str2==str1);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.compareTo(str2));

        String str3 = "  Hello ";
        char []arr1 = {' ',' ','H','e','l','l','o',' '};
        char []arr2 = {'H','e','l','l','o'};
        String str4 = "Hello";
        System.out.println(str3.equals(str4));
        System.out.println(str3.trim());
        System.out.println(str4.trim());



    }
}
