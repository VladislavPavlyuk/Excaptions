package com.company;

import java.util.Scanner;

public class Main2 {

    private static int op1;
    private static int op2;
    private static int resop;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        input();
        try {
            resop = divMethod1(op1, op2);
            System.out.println(resop);
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid input");
            start();
//            input();
//            resop = divMethod1(op1, op2);
//            System.out.println(resop);
        }
    }

    public static void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input op1");
        op1 = scan.nextInt();
        System.out.println("Input op2");
        op2 = scan.nextInt();
    }

    public static int divMethod1(int a, int b) {
        return divMethod2(a,b);
    }

    public static int divMethod2(int a, int b) {
        return divMethod3(a,b);
    }

    public static int divMethod3(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

}
