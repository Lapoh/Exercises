package org.example;

import java.util.Scanner;

public class MatrixDiagonal {
    static void getDiagonalMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Print your favorite number, but, Not gretter then 100!");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.abs(j - i);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        getDiagonalMatrix();
    }
    }
