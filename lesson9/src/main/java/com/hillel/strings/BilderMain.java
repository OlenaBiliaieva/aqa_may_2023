package com.hillel.strings;

public class BilderMain {
    public static void main(String[] args) {
        String k = "Hello java";
        StringBuilder stringBuilder = new StringBuilder("Hello java");
        stringBuilder.insert(10,'!');
        stringBuilder.insert(4,'0');
        stringBuilder.insert(12,'!');
        stringBuilder.insert(0,'^');
        stringBuilder.append(" Appender");
       // stringBuilder.setCharAt(9,'!');
        System.out.println(stringBuilder);
    }
}
