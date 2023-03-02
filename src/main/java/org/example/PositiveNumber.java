package org.example;

import java.util.Scanner;

public class PositiveNumber {
    static void checkOnePositiveIntVarOne() {
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

    public static void main(String[] args) {
        checkOnePositiveIntVarOne();
    }
}


