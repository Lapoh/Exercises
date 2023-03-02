package org.example;

import java.util.Scanner;

public class TopTriangle {
    static void makeTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a case: ");
        int triangle = scanner.nextInt();
        for (int i = 1; i <= triangle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        makeTriangle();
    }
}