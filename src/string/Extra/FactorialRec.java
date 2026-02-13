package com.gla.String;
import java.util.*;
class FactorialRec{
static long f(int n){return n<=1?1:n*f(n-1);}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.println(f(sc.nextInt()));
}}
