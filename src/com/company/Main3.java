package com.company;

import com.company.exception.MyArifmeticException;

import java.util.Scanner;

public class Main3 {

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
        catch (MyArifmeticException e) {
            System.out.println("Invalid input");
            System.out.println("Operand 1 is " + e.getOperand1() + " Operand 2 is " + e.getOperand2());
            start();
        }
    }

    public static void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input op1");
        op1 = scan.nextInt();
        System.out.println("Input op2");
        op2 = scan.nextInt();
    }

    public static int divMethod1(int a, int b) throws MyArifmeticException {
        return divMethod2(a,b);
    }

    public static int divMethod2(int a, int b) throws MyArifmeticException {
        return divMethod3(a,b);
    }

    public static int divMethod3(int a, int b) throws MyArifmeticException{
        if (b == 0) {
            MyArifmeticException myArifmeticException = new MyArifmeticException("Div by zero");
            myArifmeticException.setOperand1(a);
            myArifmeticException.setOperand2(b);
            throw myArifmeticException;
        }
        return a / b;
    }

}
