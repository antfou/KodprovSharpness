package org.example.Problem_4;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class ProblemFourMethods {


    public double solveEquation(String input){
        List<Character> operators = fetchOperator(input);
        List<Double> operands = fetchOperands(input);

        double currValue = operands.get(0);
        int i = 0;

        for (Character operator : operators) {
            i++;
            currValue = calculate(currValue, operands.get(i), operator);
        }

        return currValue;
    }

    public List<Double> fetchOperands(String input) {
        List<Character> operators = fetchOperator(input);

        List<Double> operands = new ArrayList<>();
        String remainingInput = input;

        for (Character operator : operators) {
            int operatorIndex = remainingInput.indexOf(operator);
            if (operatorIndex == -1) {
                operands.add(Double.valueOf(remainingInput));
                break;
            }
            String operand = remainingInput.substring(0, operatorIndex);
            operands.add(Double.valueOf(operand));
            remainingInput = remainingInput.substring(operatorIndex + 1);
        }

        operands.add(Double.valueOf(remainingInput));

        return operands;
    }

    public List<Character> fetchOperator(String input) {
        char[] expresison = input.toCharArray();
        List<Character> legalOperators =  List.of('+', '-', '*', '/');
        List<Character> operators = new ArrayList<>();


        for (char operator : expresison) {
            if ((legalOperators).contains(operator)) {
                operators.add(operator);
            }
        }
        return operators;
    }

    public double calculate(double operand1, double operand2, char operator) {

        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;

            default -> 0;
        };
    }
}