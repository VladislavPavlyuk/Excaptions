package com.company;

public class Main {
    public static void main(String[] args) {

        int oper1 = 100;
        int oper2 = 0;

        int[] intArray = new int[] {1,2,3,4,5};

        try {
            int res = oper1 / oper2;
            intArray[1] = 100;
            System.out.println(res);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally called");
        }
//        catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        System.out.println("end program");
    }
}