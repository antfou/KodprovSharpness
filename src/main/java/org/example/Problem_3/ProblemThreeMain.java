package org.example.Problem_3;

import java.util.Scanner;

public class ProblemThreeMain {
    public ProblemThreeMain() {
        ProblemThreeMethods methods = new ProblemThreeMethods();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Vänligen skriv in ett matematisk uttryck med 2 operander på vardera sida av en operator:");
            String input = sc.nextLine();

            System.out.println("Det blir: " +  methods.calculate(input));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ProblemThreeMain();
    }
}
