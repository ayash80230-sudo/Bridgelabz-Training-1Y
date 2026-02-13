package com.gla.String;
import java.util.*;
class Anagram{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String x=sc.nextLine().replace(" ","").toLowerCase();
String y=sc.nextLine().replace(" ","").toLowerCase();
if(x.length()!=y.length()){System.out.println("Not Anagram");return;}
int[] f=new int[26];
for(int i=0;i<x.length();i++)f[x.charAt(i)-'a']++;
for(int i=0;i<y.length();i++)f[y.charAt(i)-'a']--;
for(int v:f)if(v!=0){System.out.println("Not Anagram");return;}
System.out.println("Anagram");
}}