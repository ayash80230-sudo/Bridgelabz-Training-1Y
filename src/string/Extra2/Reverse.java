package com.gla.String;
import java.util.*;
class Reverse{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(),r="";
for(int i=s.length()-1;i>=0;i--)r+=s.charAt(i);
System.out.println(r);
}}