package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 *= 1000;
        num1 = (int)num1;
        num1 /= 1000;

        num2 *= 1000;
        num2 = (int)num2;
        num2 /= 1000;

        return num1 == num2;
    }
}