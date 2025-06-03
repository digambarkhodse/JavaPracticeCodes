package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String s="ABCDE";
       String reverse="";
       for(int i=s.length()-1;i>0;i--){
           reverse=reverse+s.charAt(i);
       }
       System.out.println(reverse);
    }
}