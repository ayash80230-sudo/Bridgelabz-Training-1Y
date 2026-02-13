package com.gla.String;
import java.util.*;
class ReplaceWord{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String[] w=sc.nextLine().split(" ");
String o=sc.nextLine(),n=sc.nextLine(),r="";
for(int i=0;i<w.length;i++){r+=w[i].equals(o)?n:w[i];if(i<w.length-1)r+=" ";}
System.out.println(r);
}}