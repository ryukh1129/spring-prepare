package com.meta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        // Given/When/Then 패턴으로 최대한 작성해야 좋다.
        // Given(주어진 것)
        Double num1 = 8.0;
        String op = "+";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        // When(실행부)
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        // Then(검증)
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        // Given/When/Then 패턴으로 최대한 작성해야 좋다.
        // Given(주어진 것)
        Double num1 = 8.0;
        String op = "/";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        // When(실행부)
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        // Then(검증)
        Assertions.assertEquals(4, result);
    }
}