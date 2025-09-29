package org.example;
public class Calculator {

    // Add two numbers
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    // Subtract two numbers
    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    // Multiply two numbers
    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    // Divide two numbers
    public int divide(int firstNum, int secondNum) {
        if (secondNum == 0) {
            System.out.println("Cannot divide by zero");
        }
        return firstNum / secondNum;
    }
}
