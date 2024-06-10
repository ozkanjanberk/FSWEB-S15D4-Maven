package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder reversed = new StringBuilder(clean).reverse();

        return clean.contentEquals(reversed);
    }

    public static String convertDecimalToBinary(int number) {
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (number > 0) {
            int remaining = number % 2;
            binaryList.addFirst(remaining);
            number = number / 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : binaryList) {
            sb.append(digit);
        }
        return sb.toString();
    }
}