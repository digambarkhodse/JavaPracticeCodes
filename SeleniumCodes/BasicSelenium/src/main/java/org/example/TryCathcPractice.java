package org.example;

public class TryCathcPractice {
    public static void main(String[] args){

        try {
            int i = 90;
            int j = 0;
            int div = i / j;
            System.out.println(div);
           }
        catch (ArithmeticException e){
        System.out.println(e);
    }
        finally {
            System.out.println("Hey I will execute anyway");
        }
    }
}
