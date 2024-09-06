package com.company;

public class Main1 {
    public static void main(String[] args) {

        int oper1 = 100;
        int oper2 = 0;
        int res = 0;

        try {
            res = func1(oper1, oper2);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally in main called");
        }
    }

    public static int divFunc(int a, int b) {
        try {
            return a / b;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("div by zero called with " + a + " " + b);
            throw e;
        } finally {
            System.out.println("Finally in divFunc called");
        }
        return 0;
    }

    public static int func1(int a, int b) {
       try {
           return divFunc(a, b);
       }
       catch (ArithmeticException e) {
           System.out.println(e.getMessage());
       }
       return 0;
    }
}
