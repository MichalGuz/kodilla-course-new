package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[]args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("The username is ok.");
        } else {
            System.out.println("Error!");
        }

        SimpleUser secondSimpleUser = new SimpleUser("theChatUser");

        String result2 = secondSimpleUser.getUsername();

        if (result2.equals("theChatUser")) {
            System.out.println("The username is ok.");
        } else {
            System.out.println("Error!");
        }

        Calculator operation1 = new Calculator(10,5);

        int result3 = operation1.add();

        if (result3 == (10 + 5)) {
            System.out.println("Operation # 1 is correct.");
        } else {
            System.out.println("Error!");
        }

        Calculator operation2 = new Calculator (6, 5);

        int result4 = operation2.substract();

        if (result4 == (6 - 5)) {
            System.out.println("Operation # 2 is correct");
        } else {
            System.out.println("Error!");
        }
    }
}
