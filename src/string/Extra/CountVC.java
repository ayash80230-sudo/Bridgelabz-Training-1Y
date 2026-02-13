package com.gla.String;
import java.util.*;
class CountVC{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();int v=0,c=0;
for(int i=0;i<s.length();i++){
char ch=Character.toLowerCase(s.charAt(i));
if(ch>='a'&&ch<='z'){if("aeiou".indexOf(ch)>=0)v++;else c++;}}
System.out.println(v);
System.out.println(c);
}}