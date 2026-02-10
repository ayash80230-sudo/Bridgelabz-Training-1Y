package com.gla.String;


import java.util.Scanner;
public class NumberFormatDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number text: ");
        String t=sc.next();
        try{
            int n=Integer.parseInt(t);
            System.out.println("Number = "+n);
        }catch(Exception e){
            System.out.println("Handled: "+e);
        }
    }
}
