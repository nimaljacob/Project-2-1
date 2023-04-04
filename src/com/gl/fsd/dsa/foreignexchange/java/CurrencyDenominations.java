package com.gl.fsd.dsa.foreignexchange.java;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominations {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of currency denominations: ");
        int n = scanner.nextInt();
        int[] denominations = new int[n];
        System.out.println("Enter the currency denominations value: ");
        for (int i = 0; i < n; i++) {
            denominations[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();
        Arrays.sort(denominations); // sort in ascending order
        int count = 0;
        System.out.println("Your payment approach in order to give min no of notes will be:");
        for (int i = n - 1; i >= 0; i--) {
            while (amount >= denominations[i]) {
                amount -= denominations[i];
                count++;
                System.out.println(denominations[i] + ":" + count);
            }
            count = 0;
        }
    }
}



