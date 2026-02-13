package com.gla.String;
import java.util.*;
class Toggle{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(),r="";
for(char ch:s.toCharArray()){
if(Character.isUpperCase(ch))r+=Character.toLowerCase(ch);
else if(Character.isLowerCase(ch))r+=Character.toUpperCase(ch);
else r+=ch;}
System.out.println(r);
}}