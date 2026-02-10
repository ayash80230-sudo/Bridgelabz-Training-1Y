package com.gla.String;


import java.util.Scanner;
public class CharactersArray{
    static char[] arr(String s){
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.next();
        char a[]=arr(s);
        char b[]=s.toCharArray();
        boolean same=true;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) same=false;
        }
        System.out.println("Same = "+same);
    }
}
