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
    }

    public static Double subtractNumbers(Double number1, Double number2){
        return number1 - number2;
    }

    public static Double divideNumbers(Double number1, Double number2){
        return number1 / number2;
    }

    public static Double multiplyNumbers(Double number1, Double number2){
        return number1 * number2;
    }

    public static Double squareNumber(Double number){
        return number * number;
    }

    public static Double squareRootNumber(Double number){
        return Math.sqrt(number);
    }

    public static Double power(Double number, Double exponent){
        return Math.pow(number, exponent);
    }

    public static Double inverse(Double number){
        return 1 / number;
    }

    public static Double sine(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.sin(Math.toDegrees(number));
        }
        return Math.sin(number);
    }

    public static Double cosine(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.cos(Math.toDegrees(number));
        }
        return Math.cos(number);
    }

    public static Double tangent(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.tan(Math.toDegrees(number));
        }
        return Math.tan(number);
    }

    public static Double inSin(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.asin(Math.toDegrees(number));
        }
        return Math.asin(number);
    }

    public static Double inCos(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.acos(Math.toDegrees(number));
        }
        return Math.acos(number);
    }

    public static Double inTan(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.atan(Math.toDegrees(number));
        }
        return Math.atan(number);
    }

    public static void switchUnitModes(){
        System.out.println("Modes: Degrees, Radians");
    }

    public static String switchUnitModes(String mode){
        if(mode.equals("Degrees")){
            return "degrees";
        }
        else if(mode.equals("Radians")){
            return "radians";
        }
        return null;
    }

    public static void switchLogarithmicFunctions(){
        System.out.println("Modes: Logarithmic Functions, Factorials");
    }

    public static String switchFactorials(String mode){
        if(mode.equals("Logarithmic Functions")){
            return "logarithmic functions";
        }
        else if (mode.equals("Factorials")){
            return "factorials";
        }
    }

}

