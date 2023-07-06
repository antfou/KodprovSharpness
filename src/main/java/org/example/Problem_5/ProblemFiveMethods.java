package org.example.Problem_5;

import java.util.ArrayList;
import java.util.List;

public class ProblemFiveMethods {

    //THIS METHOD DOES NOT WORK
    public double solveProblem(List<Double> operands, List<Character> operators){
        double result = 0;
        List<Double> operandsCopy = new ArrayList<>(operands);
        List<Character>operatorsCopy = new ArrayList<>(operators);
        int i =  0;
        int j = 0;

        for(Character o : operators){
            if (o.equals('*') || o.equals('/')) {
                operandsCopy = solveOneEquation(o,i,operandsCopy);
                operatorsCopy = removeOperatorFromList(i,operatorsCopy);
            }
            i++;
        }
        for(Character o : operatorsCopy){
            operandsCopy = solveOneEquation(o,j,operandsCopy);
            j++;
        }
        result = operandsCopy.get(0);
        return result;
    }


    public List<Double> solveOneEquation(char operator, int operatorIndex, List<Double> operands){
        List<Double> returnable = new ArrayList<>();
        int counter = 0;
        for(Double i : operands){
            if(counter == operatorIndex){
                returnable.add(calculate(i,operands.get(operatorIndex+1) ,operator));
            } else if (counter == operatorIndex + 1) {
                //gör ingenting
            } else{
                returnable.add(i);
            }
            counter++;
        }
        return returnable;
    }

    public List<Character> removeOperatorFromList(int operatorIndex, List<Character> operators){
        int i = 0;
        List<Character> returnable = new ArrayList<>();
        for(Character o : operators){
            if(i != operatorIndex){
                returnable.add(o);
            }
            i++;
        }
        return returnable;
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
