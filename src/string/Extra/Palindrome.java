package com.gla.String;
import java.util.*;
class Palindrome{
static boolean c(String s){
String r="";
for(int i=s.length()-1;i>=0;i--)r+=s.charAt(i);
return s.equals(r);}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.println(c(sc.nextLine())?"Palindrome":"Not Palindrome");
}}
