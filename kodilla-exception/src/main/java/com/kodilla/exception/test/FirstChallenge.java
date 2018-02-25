package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {

        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 1);

        try {

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("exeption" + e);

        } finally {

            System.out.println("Remember! If you divide a number by 0, your result will be equals infinity ;)");
        }

    }
}

