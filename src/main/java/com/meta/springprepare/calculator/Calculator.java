package com.meta.springprepare.calculator;

public class Calculator {
    // 한줄 주석

    /*
    ㅁ
    ㅁ
    여러 문장 주석
     */

    /**
     * 계산기 사칙 연산 함수
     * @param num1 : 입력값 1
     * @param op : 연산자
     * @param num2 : 입력값 2
     * @return : result
     */

    // 사칙 연산 기능
    public Double operate(double num1, String op, double num2) {
        switch (op) {
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return null;
                }
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                throw new IllegalArgumentException("잘못된 연산자를 입력하셨습니다.");
        }
    }
}
