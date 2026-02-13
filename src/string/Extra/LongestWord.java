package com.gla.String;
import java.util.*;
class LongestWord{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String[] w=sc.nextLine().split(" ");
String m="";
for(String x:w)if(x.length()>m.length())m=x;
System.out.println(m);
}}