package org.example.Problem_3;

import org.openqa.selenium.devtools.v112.overlay.model.LineStyle;

import java.util.Arrays;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class ProblemThreeMethods {
    public int calculate(String input) {

        char operator = fetchOperator(input);

        String[] operandsAsString = input.split(Pattern.quote(valueOf(operator)));

        int operand1 = Integer.parseInt(operandsAsString[0]);
        int operand2 = Integer.parseInt(operandsAsString[1]);

        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;

            default -> 0;
        };
    }

    public char fetchOperator(String expresison) {
        char[] legalOperators =  {'+', '-', '*', '/'};
        char legalOperator = '1';

        for (char operator : legalOperators) {
            if (expresison.indexOf(operator) != -1) {
                legalOperator = operator;
            }
        }

         return legalOperator;
    }
}
