package org.example;

public class Cast {
    public static void main(String[] args) {
        char a = 'a';
        // Integers
        byte b = 126;
        short sh = 250;
        int i = 600;
        long l = 922337203685477806L;
        //pointed
        float f = 10.8234567f;
        double d = 11.1234567890123456d;

        int castByteToInt = b;
        int castShortToInt = sh;
        int castLongToInt = (int) l;
        byte castLongToByte = (byte) l;
        int castFloatToInt = (int) f;

        double castFloatToDouble = f;
        float castDoubleToFloat = (float) d;

        System.out.println(castFloatToInt);

    }
}
