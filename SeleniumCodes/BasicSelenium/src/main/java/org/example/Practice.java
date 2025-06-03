package org.example;

public class Practice {

    public static void main(String[] args){

        int a=10;
        int b=20;
        System.out.println("Before swap");

        System.out.println(a);
        System.out.println(b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap");

        System.out.println("a  =" +a);
        System.out.println("b = "+b);

        int num1=0, num2=1,num3=0;
        System.out.print(num1+" "+num2+" ");
        for(int i=0;i<=10;i++){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" ");
        }


    }
}

