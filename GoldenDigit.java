package com.vikki.java8;

import java.util.Scanner;

public class GoldenDigit {

    // Helper method to check if a price is a "Golden Price"
    public static boolean isGoldenPrice(int price) {
        if (price <= 0) return false;

        int sumOfDigits = 0;
        int maxDigit = 0;
        int temp = price;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            temp /= 10;
        }

        // Condition: (Sum - Max) == Max is mathematically equivalent to Sum == 2 * Max
        
        return (sumOfDigits-maxDigit==maxDigit);
        //return sumOfDigits == 2 * maxDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the lower and upper bounds of the price range
        if (scanner.hasNextInt()) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Ensure X is the smaller number and Y is the larger number
            int start = Math.min(X, Y);
            int end = Math.max(X, Y);

            int totalSavings = 0;

            // Iterate through every unique product price in the range [start, end]
            for (int price = start; price <= end; price++) {
                if (isGoldenPrice(price)) {
                    totalSavings += price;
                }
            }

            // Output total accumulated savings
            System.out.print(totalSavings);
        }

        scanner.close();
    }
}

