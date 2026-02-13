package com.gla.String;
import java.util.*;
class MostFreq{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();int m=0;char ans=' ';
for(int i=0;i<s.length();i++){int c=0;for(int j=0;j<s.length();j++)if(s.charAt(i)==s.charAt(j))c++;
if(c>m){m=c;ans=s.charAt(i);}}
System.out.println(ans);
}}