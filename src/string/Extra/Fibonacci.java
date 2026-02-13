package com.gla.String;
import java.util.*;
class Fibonacci{
static void f(int n){
int a=0,b=1;
for(int i=0;i<n;i++){System.out.print(a+" ");int c=a+b;a=b;b=c;}}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
f(sc.nextInt());
}}
