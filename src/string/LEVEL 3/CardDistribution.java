package com.gla.String;


import java.util.*;
public class CardDistribution{
 static String[] suits={"Hearts","Diamonds","Clubs","Spades"};
 static String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
 static String[] deck(){
  String[] d=new String[suits.length*ranks.length]; int k=0;
  for(String s:suits) for(String r:ranks) d[k++]=r+" of "+s;
  return d;
 }
 static void shuffle(String[] d){
  for(int i=0;i<d.length;i++){
   int r=i+(int)(Math.random()*(d.length-i));
   String t=d[i]; d[i]=d[r]; d[r]=t;
  }
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),p=sc.nextInt();
  String[] d=deck(); shuffle(d);
  if(n%p!=0){System.out.println("Cannot distribute");return;}
  int k=0,each=n/p;
  for(int i=0;i<p;i++){
   System.out.println("Player "+(i+1));
   for(int j=0;j<each;j++) System.out.println(d[k++]);
  }
 }
}
