package com.gla.String;


import java.util.*;
public class AnagramCheck{
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s1=sc.nextLine(),s2=sc.nextLine();
  if(s1.length()!=s2.length()){System.out.println(false);return;}
  int[] f=new int[256];
  for(int i=0;i<s1.length();i++){f[s1.charAt(i)]++; f[s2.charAt(i)]--;}
  for(int i=0;i<256;i++) if(f[i]!=0){System.out.println(false);return;}
  System.out.println(true);
 }
}
