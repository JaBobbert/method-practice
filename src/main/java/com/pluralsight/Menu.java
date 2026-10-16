package com.pluralsight;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(displayMenu(scan));
        System.out.println(displayMenu(scan));
    }

    public static String displayMenu(Scanner pick){
        System.out.println("=== MENU ===" +
                "\n 1. Coffee - $3.99" +
                "\n 2. Tea - $2.99" +
                "\n 3. Cookie - $1.99");

        int choose = pick.nextInt();
        switch (choose){
            case 1 -> {
                return "You chosen Coffee.";
            }
            case 2  -> {
                return "You chosen Tea.";
            }
            case 3 -> {
                return "You chosen Cookie.";
            }
            default -> {
                return "Invalid Answer.";
            }
        }

    }
}
