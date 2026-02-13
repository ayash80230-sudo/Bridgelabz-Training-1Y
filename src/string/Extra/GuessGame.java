package com.gla.String;
import java.util.*;
class GuessGame{
static int g(int l,int h){return(l+h)/2;}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
int l=1,h=100;
while(true){
int x=g(l,h);
System.out.println(x);
String f=sc.next();
if(f.equals("correct"))break;
else if(f.equals("high"))h=x-1;
else l=x+1;
}
}}
