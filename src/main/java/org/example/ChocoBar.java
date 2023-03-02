package org.example;

import java.util.Scanner;

public class Exercises {
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

    static void getListArrayWithOnePositiveIntVarOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x <= 0 && y <= 0 && z > 0) {
            System.out.println("true");
        } else if (x <= 0 && y > 0 && z <= 0) {
            System.out.println("true");
        } else if (x > 0 && y <= 0 && z <= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void getSumForChocolateBar(int N, int M, int K) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Input N, M and K segments:");
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();

    }
}