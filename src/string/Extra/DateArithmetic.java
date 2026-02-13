package com.gla.String;
import java.time.*;
import java.util.*;
class DateArithmetic{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int y=sc.nextInt(),m=sc.nextInt(),d=sc.nextInt();
LocalDate date=LocalDate.of(y,m,d);
date=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
System.out.println(date);
}
}