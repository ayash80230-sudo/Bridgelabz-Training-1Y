package com.gla.String;


import java.util.Scanner;
public class StringIndexDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.next();
        try{
            System.out.println(s.charAt(s.length()+1));
        }catch(Exception e){
            System.out.println("Handled: "+e);
        }
    }
}
