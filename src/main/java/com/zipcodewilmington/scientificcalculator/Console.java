package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {

        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {

        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;
    }

    // add
    public static Double addNumbers(Double number1, Double number2){

        return number1 + number2;
    }

    public static void displayZero () {
        int displayZero = 0;
        System.out.println( displayZero);

    }
    public static Double numberSign(Double userNumber) {
        return -userNumber;
//        if (userNumber > 0) {
//            userNumber = -userNumber;
////        System.out.println("-" + userNumber);
//        }
//        else { System.out.println(userNumber);
//    }
    }


}

