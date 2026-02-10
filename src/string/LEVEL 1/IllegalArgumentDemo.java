package com.gla.String;


import java.util.Scanner;
public class IllegalArgumentDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.next();
        try{
            System.out.println(s.substring(5,2));
        }catch(Exception e){
            System.out.println("Handled: "+e);
        }
    }
}
