package com.gla.String;
import java.util.*;
class PrimeCheck{
static boolean p(int n){
if(n<2)return false;
for(int i=2;i*i<=n;i++)if(n%i==0)return false;
return true;}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.println(p(sc.nextInt())?"Prime":"Not Prime");
}}
