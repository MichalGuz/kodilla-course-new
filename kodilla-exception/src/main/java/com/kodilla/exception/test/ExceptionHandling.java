package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args){
        SecondChallenge processor = new SecondChallenge();

        try {
            String result = processor.probablyIWillThrowException(2.0, 2.0);
            System.out.println("Result =" + result);

        } catch (Exception e) {

            System.out.println("Look out! It's an exception: " + e);

        }

        finally {

            System.out.println("This line is printed every time.");

        }
    }
}
