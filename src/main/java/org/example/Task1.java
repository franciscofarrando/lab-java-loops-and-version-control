package org.example;

public class Task1 {
    public static void main(String[] args) {
        int [] numberList = {10,4,5,2,9};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;


        for(int number: numberList) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }
        int difference = largest-smallest;
        System.out.println(difference);
    }
}
