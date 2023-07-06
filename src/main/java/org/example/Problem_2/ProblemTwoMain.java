package org.example.Problem_2;

import java.util.Scanner;

public class ProblemTwoMain {
    ProblemTwoMain(){

        ProblemTwoMethods methods = new ProblemTwoMethods();
        ProblemTwoErrorhandling errorhandling = new ProblemTwoErrorhandling();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Vänligen skriv in en giltigt url till en hemsida: t.ex: 'google.com' ");
            String input = errorhandling.normalizeUrl(sc.nextLine());

            if (errorhandling.isValidUrl(input)) {
                System.out.println("Det finns " + methods.countHTMLtags(input) + " st 'a'-tags på den sidan.");
            } else {
                System.out.println("Enter a valid URL!");
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new ProblemTwoMain();
    }
}
