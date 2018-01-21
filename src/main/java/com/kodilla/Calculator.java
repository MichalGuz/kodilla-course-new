package com.kodilla;

public class Calculator {
    public int x;
    public int y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int add(){
        int add = x + y;
        return add;
    }
    public int substract(){
        int substract = x - y;
        return substract;
    }
}

class Operation{

    public static void main (String[]args) throws java.lang.Exception{
        Calculator operation1 = new Calculator(8,3);
        System.out.println(operation1.substract());
    }
}