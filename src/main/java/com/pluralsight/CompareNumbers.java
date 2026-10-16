package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {

        System.out.println(isEven(5));
        System.out.println(isEven(10));
        System.out.println(isPositive(10));
    }

    public static boolean isEven(int number) {
    return number % 2 == 0;
    }
    public static boolean isPositive(int number){
        return number > 0;
    }
}
