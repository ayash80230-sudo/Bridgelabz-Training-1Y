package com.gla.String;
import java.util.*;
class Temperature{
static double ctof(double c){return c*9/5+32;}
static double ftoc(double f){return(f-32)*5/9;}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();double t=sc.nextDouble();
if(ch==1)System.out.println(ctof(t));else System.out.println(ftoc(t));
}}
