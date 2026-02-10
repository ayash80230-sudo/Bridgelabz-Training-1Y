package com.gla.String;


import java.util.Scanner;
public class UppercaseConverter{
    static String up(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z') c=(char)(c-32);
            r=r+c;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Manual: "+up(s));
        System.out.println("Built-in: "+s.toUpperCase());
    }
}
