package com.gla.String;


import java.util.*;
public class UniqueCharacters{
 static char[] unique(String s){
  char[] res=new char[s.length()];
  int k=0;
  for(int i=0;i<s.length();i++){
   boolean ok=true;
   for(int j=0;j<i;j++) if(s.charAt(i)==s.charAt(j)) ok=false;
   if(ok) res[k++]=s.charAt(i);
  }
  return Arrays.copyOf(res,k);
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  for(char c:unique(s)) System.out.print(c+" ");
 }
}
