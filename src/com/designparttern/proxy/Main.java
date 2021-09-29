package com.designparttern.proxy;
/**
 * Structural Pattern: Proxy
 * What: proxy means an object representing another object
 * Why: A Proxy pattern "provide the control for accessing the original object"
 *
 * */


public class Main {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorProxy();
        double result = calculator.div(4,0);
        System.out.println(result);
    }
}
