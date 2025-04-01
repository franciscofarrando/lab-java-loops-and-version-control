package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] numberList = {10, 4, 5, 2, 9};
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;

        for(int number: numberList) {
            if (number < smallest1) {
                smallest2=smallest1;
                smallest1 = number;
            } else if (number <smallest2 && number != smallest1) {
                smallest2=number;
            }
        }
        System.out.println(smallest1);
        System.out.println(smallest2);
    }
}
