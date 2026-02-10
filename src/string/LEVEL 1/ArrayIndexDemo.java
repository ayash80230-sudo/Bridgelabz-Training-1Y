package com.gla.String;


import java.util.Scanner;
public class ArrayIndexDemo{
    public static void main(String[] args){
        String a[]={"A","B"};
        try{
            System.out.println(a[5]);
        }catch(Exception e){
            System.out.println("Handled: "+e);
        }
    }
}
