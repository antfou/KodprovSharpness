package org.example.Problem_4;

public class ProblemFourMain {
    public ProblemFourMain() {
        ProblemFourMethods methods = new ProblemFourMethods();

        final String test = "10*10*10";

        System.out.println(methods.solveEquation(test));


    }
    public static void main(String[] args) {
        new ProblemFourMain();
    }
}
