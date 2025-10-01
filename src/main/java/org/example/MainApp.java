package org.example;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

            //setup scanner
            Scanner scan = new Scanner(System.in);
            String ans = "Y";

            // continues loop until answer is anything but a yes
            while (ans.equalsIgnoreCase("Y")) {
                //get operation from user
                System.out.println("Please enter an operation (add, subtract, multiply, divide)");
                String operation = scan.next();
                System.out.println(operation);

                //get numbers from user
                System.out.println("Please enter your first number");
                int firstNum = scan.nextInt();
                System.out.println("Please enter your second number");
                int secondNum = scan.nextInt();

                //Adding in calculator class
                Calculator calculator = new Calculator();

                //Apply operation
                int result = switch (operation) {
                    case "add" -> calculator.add_numbers(firstNum, secondNum);
                    case "subtract" -> calculator.subtract_numbers(firstNum, secondNum);
                    case "multiply" -> calculator.multiply_numbers(firstNum, secondNum);
                    case "divide" -> calculator.divide_numbers(firstNum, secondNum);
                    default -> 0;
                };

                // print result and scan in answer for retry
                System.out.println("The result is: " + result);
                System.out.println("Would you like to perform another operation? (Y/N)");
                ans = scan.next();
            }

            //exiting message
            System.out.println("Thanks for using the calculator, Goodbye..");
            scan.close();
        }
    }

