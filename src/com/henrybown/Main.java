package com.henrybown;

public class Main {

    public static void main(String[] args) {
        String string = "Hello, world!";
        int[] array = {12,1,2,5,3,0,4,6,8,7,9,11,10};

        System.out.println(string);                         // => "Hello, world!"
        System.out.println(remixString(string, array ));    // => "!el,lHo owrdl"


        System.out.println(primesBelowValue(100000));       // => 9592
        System.out.println(primesBelowValue(10));           // => 4
    }

    private static String remixString(String inputString, int[] intArray) {
        // Convert input string to an array of chars
        char[] inputCharArray = inputString.toCharArray();
        // Create output array of equal length to input
        char[] outputCharArray = new char[inputCharArray.length];

        // For each character in the array, set the character equal to the index specified by the intArray
        for (int i : intArray) {
            outputCharArray[i] = inputCharArray[intArray[i]];
        }
        return new String(outputCharArray);
    }

    private static int primesBelowValue(int value) {
        int primes = 0;

        // For each integer up to the input value
        for (int i = 0; i <= value; i++) {
            // Check for if it is a prime number, and add 1 to primes if it is
            if (isPrime(i)) {
                primes++;
            }
        }
        // Return number of primes below input value
        return primes;
    }

    private static boolean isPrime(int checkInt) {
        // Exclude 0 and 1 as they are not primes
        if (checkInt == 0 || checkInt == 1) {
            return false;
        } else {
            // Check for each value up to half of the checkInt if it is a factor
            for (int i = 2; i <= checkInt/2; i++) {
                if (checkInt % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
