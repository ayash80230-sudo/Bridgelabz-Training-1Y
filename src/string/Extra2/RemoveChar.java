package com.gla.String;
import java.util.*;
class RemoveChar{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();char r=sc.nextLine().charAt(0);String o="";
for(int i=0;i<s.length();i++)if(s.charAt(i)!=r)o+=s.charAt(i);
System.out.println(o);
}}