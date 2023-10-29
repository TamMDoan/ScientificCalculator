package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Console.addNumbers;
import static com.zipcodewilmington.scientificcalculator.Console.numberSign;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Double currentNumber = 0.0;
        Double memoryNum = 0.0;


        Console.println("CURRENT NUMBER: %s", currentNumber);

//        String s = Console.getStringInput("Enter a string");
        currentNumber = Console.getDoubleInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");

//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a double", d);
        Console.println("CURRENT NUMBER: %s", currentNumber);

        while (true) {
            Console.println("What do you want to do? 1) Add 2) Subtract 3) Invert 4) M+");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (Objects.equals(userInput, "Add")) {
                Double i2 = Console.getDoubleInput("Enter an integer to add");
                currentNumber = addNumbers(currentNumber, i2);
                Console.println("CURRENT NUMBER: %s", currentNumber);
            } else if (Objects.equals(userInput, "Invert")) {
                currentNumber = numberSign(currentNumber);
                Console.println("CURRENT NUMBER: %s", currentNumber);
            } else if (Objects.equals(userInput, "Exit")) {
                break;
            }
        }

    }
}
