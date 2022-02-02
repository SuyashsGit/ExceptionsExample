package com.sparta.exceptions.divideByZeroException;

public class Calculator {
    public static int divide(int num1, int num2){
        if(num2 == 0) throw new DivideByZeroException("Divisor cannot be 0");
        return num1/num2;
    }

    public static void main(String[] args) {

        System.out.println(divide(1,0));
    }
}
