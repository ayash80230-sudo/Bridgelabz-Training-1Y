package com.gla.String;
import java.util.*;
class Calculator{
static double a(double x,double y){return x+y;}
static double s(double x,double y){return x-y;}
static double m(double x,double y){return x*y;}
static double d(double x,double y){return x/y;}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
double x=sc.nextDouble(),y=sc.nextDouble();char o=sc.next().charAt(0);
if(o=='+')System.out.println(a(x,y));
else if(o=='-')System.out.println(s(x,y));
else if(o=='*')System.out.println(m(x,y));
else System.out.println(d(x,y));
}}
