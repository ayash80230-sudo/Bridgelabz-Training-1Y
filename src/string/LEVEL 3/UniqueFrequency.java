package com.gla.String;


import java.util.*;
public class UniqueFrequency{
 static char[] unique(String s){
  char[] r=new char[s.length()];int k=0;
  for(int i=0;i<s.length();i++){
   boolean ok=true;
   for(int j=0;j<i;j++) if(s.charAt(i)==s.charAt(j)) ok=false;
   if(ok) r[k++]=s.charAt(i);
  }
  return Arrays.copyOf(r,k);
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  char[] u=unique(s);
  for(char c:u){
   int count=0;
   for(int i=0;i<s.length();i++) if(s.charAt(i)==c) count++;
   System.out.println(c+" "+count);
  }
 }
}
