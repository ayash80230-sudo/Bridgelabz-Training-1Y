package com.gla.String;
import java.util.*;
class MaxThree{
static int m(int a,int b,int c){
if(a>b&&a>c)return a;
if(b>c)return b;
return c;}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.println(m(sc.nextInt(),sc.nextInt(),sc.nextInt()));
}}
