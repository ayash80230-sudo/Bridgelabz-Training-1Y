package com.gla.String;
import java.util.*;
class GcdLcm{
static int g(int a,int b){return b==0?a:g(b,a%b);}
static int l(int a,int b){return a*b/g(a,b);}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt(),y=sc.nextInt();
System.out.println(g(x,y));
System.out.println(l(x,y));
}}
