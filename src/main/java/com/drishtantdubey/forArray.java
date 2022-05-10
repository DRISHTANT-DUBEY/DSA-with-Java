package com.drishtantdubey;

import java.util.Arrays;
import java.util.Scanner;

public class forArray {
    public static void main(String[] args) {
        try {
            Scanner main_scanner = new Scanner(System.in);
            System.out.println("Your array type are:\n 1.Numbers\n 2.String\n 3.Character\n 4.Long\n 5.Doubles");
            System.out.println("Enter Your Array Type Name as Given Above:");
            String array_type = main_scanner.nextLine();
            System.out.println("Enter Your Array Limit:");
            int limit = main_scanner.nextInt();
            System.out.println("Your display style are:\n [Default]-For Normal Indexing\n [1]-For Reverse Indexing\n [2]-For Streams Indexing");
            System.out.println("Enter Your Array Type Name as Given Above:");
            int diplay_style = main_scanner.nextInt();
            int[] numbers = new int[limit];
            String[] strings = new String[limit];
            char[] chars = new char[limit];
            double[] doubles = new double[limit];
            long[] longs= new long[limit];
            switch (array_type) {
                case "Numbers":
                    System.out.println(input_IntArray(numbers, diplay_style));
                    break;
                case "String":
                    System.out.println(input_StringArray(strings, diplay_style));
                    break;
                case "Character":
                    System.out.println(input_CharArray(chars, diplay_style));
                    break;
                case "Doubles":
                    System.out.println(input_DoubleArray(doubles, diplay_style));
                    break;
                case "Long":
                    System.out.println(input_LongArray(longs, diplay_style));
                    break;
                default:
                    System.out.println("Looking forward to a right array category");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong in input of either array type or limit");
        }
    }

    public static String input_IntArray (int [] numbers, int diplay_style ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter The Array Element " + i + " :" );
            numbers[i] = scanner.nextInt();
        }
        switch (diplay_style) {
            //Reverse Indexing Display
            case 1:
                for (int i = numbers.length-1 ; i >= 0; i--) {
                    System.out.println("\n" + numbers[i]);
                }
                break;
            //Streaming Display
            case 2:
                Arrays.stream(numbers).forEach(System.out::println);
                break;
            //Normal Indexing Display
            default:
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("\n" + numbers[i]);
                }

        }
        return (Arrays.toString(numbers));
    }
    public static String input_StringArray (String [] strings, int diplay_style ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Enter The Array Element " + i + " :" );
            strings[i] = scanner.nextLine();
        }
        switch (diplay_style) {
            //Reverse Indexing Display
            case 1:
                for (int i = strings.length-1 ; i >= 0; i--) {
                    System.out.println("\n" + strings[i]);
                }
                break;
            //Streaming Display
            case 2:
                Arrays.stream(strings).forEach(System.out::println);
                break;
            //Normal Indexing Display
            default:
                for (int i = 0; i < strings.length; i++) {
                    System.out.println("\n" + strings[i]);
                }

        }
        return (Arrays.toString(strings));
    }
    public static String input_CharArray (char [] chars, int diplay_style ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Enter The Array Element " + i + " :" );
            chars[i] = scanner.next().charAt(0);
        }
        switch (diplay_style) {
            //Reverse Indexing Display
            case 1:
                for (int i = chars.length-1 ; i >= 0; i--) {
                    System.out.println("\n" + chars[i]);
                }
                break;
            //Streaming Display
            case 2:
                Arrays.stream(new char[][]{chars}).forEach(System.out::println);
                //Bugged Show Charecter Without Spaces and
                //Try to find Out How to use Spaces in Streams While Printing
                break;
            //Normal Indexing Display
            default:
                for (int i = 0; i < chars.length; i++) {
                    System.out.println("\n" + chars[i]);
                }

        }
        return (Arrays.toString(chars));
    }

    public static String input_DoubleArray (double [] doubles, int diplay_style ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < doubles.length; i++) {
            System.out.println("Enter The Array Element " + i + " :" );
            doubles[i] = scanner.nextDouble();
        }
        switch (diplay_style) {
            //Reverse Indexing Display
            case 1:
                for (int i = doubles.length-1 ; i >= 0; i--) {
                    System.out.println("\n" + doubles[i]);
                }
                break;
            //Streaming Display
            case 2:
                Arrays.stream(doubles).forEach(System.out::println);
                break;
            //Normal Indexing Display
            default:
                for (int i = 0; i < doubles.length; i++) {
                    System.out.println("\n" + doubles[i]);
                }

        }
        return (Arrays.toString(doubles));
    }
    public static String input_LongArray (long [] longs, int diplay_style ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < longs.length; i++) {
            System.out.println("Enter The Array Element " + i + " :" );
            longs[i] = scanner.nextLong();
        }
        switch (diplay_style) {
            //Reverse Indexing Display
            case 1:
                for (int i = longs.length-1 ; i >= 0; i--) {
                    System.out.println("\n" + longs[i]);
                }
                break;
            //Streaming Display
            case 2:
                Arrays.stream(longs).forEach(System.out::println);
                break;
            //Normal Indexing Display
            default:
                for (int i = 0; i < longs.length; i++) {
                    System.out.println("\n" + longs[i]);
                }

        }
        return (Arrays.toString(longs));
    }
}
