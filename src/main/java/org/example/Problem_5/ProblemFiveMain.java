package org.example.Problem_5;

import java.util.List;

public class ProblemFiveMain {

    ProblemFiveMain(){
        ProblemFiveMethods methods = new ProblemFiveMethods();

        final List<Double> operands = List.of(112.0,8.0,3.0,40.0);
        final List<Character> operators = List.of('+','*','-');

        System.out.println(methods.solveProblem(operands,operators));
    }

    public static void main(String[] args) {
        new ProblemFiveMain();
    }
}
