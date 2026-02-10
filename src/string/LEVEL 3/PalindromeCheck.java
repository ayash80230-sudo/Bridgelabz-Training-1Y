package com.gla.String;


import java.util.*;
public class PalindromeCheck{
 static boolean loop(String s){
  int i=0,j=s.length()-1;
  while(i<j){ if(s.charAt(i)!=s.charAt(j)) return false; i++; j--; }
  return true;
 }
 static boolean rec(String s,int i,int j){
  if(i>=j) return true;
  if(s.charAt(i)!=s.charAt(j)) return false;
  return rec(s,i+1,j-1);
 }
 static boolean array(String s){
  char[] a=s.toCharArray(); char[] r=new char[a.length];
  for(int i=0;i<a.length;i++) r[i]=a[a.length-1-i];
  for(int i=0;i<a.length;i++) if(a[i]!=r[i]) return false;
  return true;
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  System.out.println(loop(s));
  System.out.println(rec(s,0,s.length()-1));
  System.out.println(array(s));
 }
}
