package ru.itgirls.calcapp.service;

import ru.itgirls.calcapp.util.Calculator;

public class ResultWriterService {
    public static void printResult() {
        int a = 5;
        int b = 7;
        int result1 = Calculator.calculateSum(a,b);
        int result2 = Calculator.calculateDifference(a,b);
        int result3 = Calculator.calculateMultiply(a,b);
        System.out.println("sum: " + result1);
        System.out.println("difference: " + result2);
        System.out.println("multiply: " + result3);
    }

}
