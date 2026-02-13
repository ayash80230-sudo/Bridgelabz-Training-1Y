package com.gla.String;
import java.util.*;
class Lexico{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String x=sc.nextLine(),y=sc.nextLine();int i=0;
while(i<x.length()&&i<y.length()){
if(x.charAt(i)<y.charAt(i)){System.out.println(x+" comes before "+y);return;}
if(x.charAt(i)>y.charAt(i)){System.out.println(y+" comes before "+x);return;}i++;}
if(x.length()<y.length())System.out.println(x+" comes before "+y);
else if(x.length()>y.length())System.out.println(y+" comes before "+x);
else System.out.println("Equal");
}}