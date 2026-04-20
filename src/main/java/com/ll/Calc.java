package com.ll;

public class Calc {
    public static int run(String expression) {

        // 공백으로 토큰 나눔
        String[] tokens = expression.split(" ");

        // 연산자와 숫자 순서대로 번걸아 처리
        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int num = Integer.parseInt(tokens[i + 1]);

            if (operator.equals("+")) {
                result += num;
            } else if (operator.equals("-")) {
                result -= num;
            }
        }
        return result;
    }
}
