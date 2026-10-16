package com.pluralsight;

public class Format {
    public static void main(String[] args) {

        System.out.println(formatName("Jacob", "Davis"));
    }

    public static String formatName(String first, String last){
        return "Hello " + last + ", " + first;
    }
}
