package com.gla.String;
import java.util.*;
class RemoveDup{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(),r="";
for(int i=0;i<s.length();i++)if(r.indexOf(s.charAt(i))==-1)r+=s.charAt(i);
System.out.println(r);
}}