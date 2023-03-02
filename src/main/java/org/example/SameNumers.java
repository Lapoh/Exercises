package org.example;

import java.util.Scanner;

public class SameNumers {
    static void checkTheSameNumbersVarOne() {
        //Ex. 1
        //Var.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x == y || x == z || y == z) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    static void checkTheSameNumberVarTwo() {
        //Var.2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        String result = (x == y || x == z || y == z) ? "false" : "true";
        System.out.println(result);
    }
    public static void main(String[] args) {

    }
}
