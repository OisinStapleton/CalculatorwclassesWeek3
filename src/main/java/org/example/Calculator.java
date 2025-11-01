package org.example;
public class Calculator {

    private String operation;

    private int firstNumber;

    private int secondNumber;


    // Add two numbers
    public int add_numbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }

    // Subtract two numbers
    public int subtract_numbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        return result;

    }

    // Multiply two numbers
    public int multiply_numbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        return result;

    }

    // Divide two numbers
    public int divide_numbers(int firstNum, int secondNum) {
        if (secondNum == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return firstNum / secondNum;
    }

    // Power of two numbers
    public int power_numbers(int firstNum, int secondNum) {
        int result = (int) Math.pow(firstNum, secondNum);
        return result;
    }

    // Modulus of two numbers
    public int modulus_numbers(int firstNum, int secondNum) {
        int result = firstNum % secondNum;
        return result;
    }

}
