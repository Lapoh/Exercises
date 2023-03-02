package org.example;

import java.util.Scanner;

public class ChocoBar {

    static void getSumForChocolateBar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Print 3 element, like n, m, k:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (k <= n * m && (k % n == 0 || k % m == 0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        getSumForChocolateBar();
    }
}