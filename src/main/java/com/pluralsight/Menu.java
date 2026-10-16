package com.pluralsight;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        displayMenu(scan);
        displayMenu(scan);
        displayMenu(scan);
    }

    public static void displayMenu(Scanner pick){
        System.out.println("=== MENU ===" +
                "\n 1. Coffee - $3.99" +
                "\n 2. Tea - $2.99" +
                "\n 3. Cookie - $1.99");

        int choose = pick.nextInt();
        switch (choose){
            case 1 -> {
                System.out.println("You chosen Coffee.");
            }
            case 2  -> {
                System.out.println("You chosen Tea.");
            }
            case 3 -> {
                System.out.println("You chosen Cookie.");
            }
            default -> {
                System.out.println("Invalid Answer.");
            }
        }

    }
}
