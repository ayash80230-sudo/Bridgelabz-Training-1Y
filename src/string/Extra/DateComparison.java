package com.gla.String;
import java.time.*;
import java.util.*;
class DateComparison{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
LocalDate a=LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
LocalDate b=LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
if(a.isBefore(b))System.out.println("Before");
else if(a.isAfter(b))System.out.println("After");
else System.out.println("Same");
}
}