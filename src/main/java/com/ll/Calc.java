package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calc {
    public static int run(String expression) {
        List<String> tokens = new ArrayList<>(Arrays.asList(expression.split(" ")));

        // 곱셈 계산 처리
        int i = 0;
        while (i < tokens.size()) {
            if (tokens.get(i).equals("*")) {

                int left = Integer.parseInt(tokens.get(i - 1));
                int right = Integer.parseInt(tokens.get(i + 1));

                int result = left * right;

                tokens.set(i - 1, String.valueOf(result));
                tokens.remove(i);
                tokens.remove(i);
            } else {
                i++;
            }
        }

        // 덧셈, 뺄셈 계산 처리
        int result = Integer.parseInt(tokens.get(0)); // 첫 번째 숫자로 시작

        for (i = 1; i < tokens.size(); i += 2) {
            String operator = tokens.get(i); // 연산자 (+ 또는 -)
            int num = Integer.parseInt(tokens.get(i + 1)); // 다음 숫자

            if (operator.equals("+")) {
                result += num;
            } else if (operator.equals("-")) {
                result -= num;
            }
        }

        return result;

    }
}
