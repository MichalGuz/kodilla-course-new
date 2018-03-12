package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class CalcRunner {
    @Autowired
    private Calculator calculator;

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dzialanie(1:+,2:-,3:*,4:/): ");
        String expr = scanner.nextLine();
        System.out.println("A: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("B: ");
        int b = Integer.parseInt(scanner.nextLine());
        if (expr.equals("1")) {
            System.out.println(calculator.add(a, b));
        }
    }
}
