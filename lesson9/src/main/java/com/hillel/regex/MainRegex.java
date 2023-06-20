package com.hillel.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit Java!");
        System.out.println(matcher.find());
        System.out.println(matcher.replaceAll("k"));
    }
}
