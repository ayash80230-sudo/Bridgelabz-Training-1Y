package com.gla.String;


import java.util.Scanner;
public class CreateSubstring{
    static String make(String s,int st,int en){
        String r="";
        for(int i=st;i<en;i++){
            r=r+s.charAt(i);
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.next();
        System.out.print("Start: ");
        int a=sc.nextInt();
        System.out.print("End: ");
        int b=sc.nextInt();
        System.out.println("Manual: "+make(s,a,b));
        System.out.println("Built-in: "+s.substring(a,b));
    }
}
