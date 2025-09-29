package org.example;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int firstNum = scan.nextInt();
        System.out.println("Please enter your second number");
        int secondNum = scan.nextInt();
        Calculator calc = new Calculator();
        calc.add(firstNum, secondNum);
        int result = calc.add(firstNum, secondNum);
        System.out.println("The result is: " + result);

    }
}
