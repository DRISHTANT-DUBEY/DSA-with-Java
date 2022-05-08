package com.drishtantdubey;

import java.util.Arrays;
import java.util.Scanner;

public class forArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        input_IntArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] input_IntArray (int [] numbers ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter The Array Element " + i + " :" );
            numbers[i] = scanner.nextInt();
        }
        return (numbers);
    }
}
