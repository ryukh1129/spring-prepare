package com.meta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("계산기 테스트")
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
    @DisplayName("빼기 테스트")
    void test2() {
        // Given(주어진 것)
        Double num1 = 8.0;
        String op = "-";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        // When(실행부)
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        // Then(검증)
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void test3() {
        // Given(주어진 것)
        Double num1 = 8.0;
        String op = "*";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        // When(실행부)
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        // Then(검증)
        Assertions.assertEquals(16, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test4() {
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

    @Test
    @DisplayName("나누기 Null 테스트")
    void test5() {
        // Given(주어진 것)
        Double num1 = 8.0;
        String op = "/";
        Double num2 = 0.0;
        Calculator calculator = new Calculator();

        // When(실행부)
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result = " + result);

        // Then(검증)
        Assertions.assertNull(result);
    }

    @Test
    @DisplayName("잘못된 연산자 입력 테스트")
    void test6() {
        // Given(주어진 것)
        Double num1 = 8.0;
        String op = "%";
        Double num2 = 2.0;
        Calculator calculator = new Calculator();

        // When(실행부)
        // .java 파일에서 IllegalArgumentException 지정했는지 검사
        IllegalArgumentException thrown = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.operate(num1, op, num2)
        );

        // Then(검증)
        Assertions.assertEquals("잘못된 연산자를 입력하셨습니다.", thrown.getMessage());
    }
}