package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {

        try {

            return a / b;


        } catch (ArithmeticException e) {

            System.out.println("Caution! Something went wrong!" + e);

        } finally {

            System.out.println("Remember! If you divide a number by 0, your result will be equals infinity ;)");
        }

        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}

