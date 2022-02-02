package com.sparta.exceptionsTest.divideByZeroExceptionTest;

import com.sparta.exceptions.divideByZeroException.Calculator;
import com.sparta.exceptions.divideByZeroException.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest
{
    @Test
    @DisplayName("Given the number is divided by zero, then the calculator divide method should throw DivideByZeroException")

    public void divideByZero(){
        var ex = Assertions.assertThrows(DivideByZeroException.class, ()-> Calculator.divide(1,0), "No exception thrown");
        Assertions.assertEquals("Divisor cannot be 0",ex.getMessage());
    }
}
