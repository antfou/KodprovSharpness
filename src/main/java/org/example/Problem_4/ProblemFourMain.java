package org.example.Problem_4;

import java.util.Scanner;

public class ProblemFourMain {
    public ProblemFourMain() {
        ProblemFourMethods methods = new ProblemFourMethods();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Vänligen skriv in ett matematisk uttryck med en eller flera operatorer:");
            String input = sc.nextLine();

            System.out.println("Det blir: " +  methods.solveEquation(input));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ProblemFourMain();
    }
}
