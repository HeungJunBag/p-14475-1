package com.ll;

public class Calc {
    public static int run(String expression) {

        if (expression.contains(" - ")) {
            String[] expressionBits = expression.split(" - ");

            int num1 = Integer.parseInt(expressionBits[0]);
            int num2 = Integer.parseInt(expressionBits[1]);

            return num1 - num2;
        }

        String[] expressionBits = expression.split(" \\+ ");
        int result = Integer.parseInt(expressionBits[0]);
        for (int i = 1; i < expressionBits.length; i++) {
            result += Integer.parseInt(expressionBits[i]);
        }

        return result;
    }
}
