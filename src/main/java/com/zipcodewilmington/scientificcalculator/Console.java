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
            return Math.toDegrees(Math.sin(number));
        }
        return Math.sin(number);
    }

    public static Double cosine(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.cos(number));
        }
        return Math.cos(number);
    }

    public static Double tangent(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.tan(number));
        }
        return Math.tan(number);
    }

    public static Double inSin(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.asin(number));
        }
        return Math.asin(number);
    }

    public static Double inCos(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.acos(number));
        }
        return Math.acos(number);
    }

    public static Double inTan(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.atan(number));
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


}

