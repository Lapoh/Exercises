package org.example;

import java.util.Scanner;

public class MatrixColor {
    static boolean checkMatrixPatternColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hy!");
        System.out.println("Print variable:");
        char[][] array = new char[4][4];

        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            array[i] = line.toCharArray();
        }


        char letter;
        boolean pretty = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                letter = array[i][j];

                if (array[i + 1][j] == letter && array[i][j + 1] == letter && array[i + 1][j + 1] == letter) {
                    pretty = false;
                }
            }
        }

        if (pretty) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        return pretty;
    }

    public static void main(String[] args) {
        checkMatrixPatternColor();
    }
}