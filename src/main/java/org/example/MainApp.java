package org.example;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {

        //setup scanner
        Scanner scan = new Scanner(System.in);

        //get operation from user
        System.out.println("Please enter an operation (add, subtract, multiply, divide)");
        String operation = scan.next();
        System.out.println(operation);

        //get numbers from user
        System.out.println("Please enter your first number");
        int firstNum = scan.nextInt();
        System.out.println("Please enter your second number");
        int secondNum = scan.nextInt();

        org.example.Calculator calc = new org.example.Calculator();
        //Apply operation
        int result = switch(operation) {
            case "add" -> calc.add_numbers(firstNum, secondNum);
            case "subtract" -> calc.subtract_numbers(firstNum, secondNum);
            case "multiply" -> calc.multiply_numbers(firstNum, secondNum);
            case "divide" -> calc.divide_numbers(firstNum, secondNum);
            default -> 0;
        };

        System.out.println("The result is: " + result);

    }
}
