package com.gla.String;
import java.util.*;
class SubCount{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(),sub=sc.nextLine();int c=0;
for(int i=0;i<=s.length()-sub.length();i++)if(s.substring(i,i+sub.length()).equals(sub))c++;
System.out.println(c);
}}