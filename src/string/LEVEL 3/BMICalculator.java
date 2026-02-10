package com.gla.String;


import java.util.*;
public class BMICalculator{
 static String status(double bmi){
  if(bmi<18.5) return "Underweight";
  else if(bmi<25) return "Normal";
  else if(bmi<30) return "Overweight";
  else return "Obese";
 }
 public static void main(String[] a){
  Scanner sc=new Scanner(System.in);
  double[][] data=new double[10][2];
  for(int i=0;i<10;i++){
   data[i][0]=sc.nextDouble(); // weight kg
   data[i][1]=sc.nextDouble(); // height cm
  }
  System.out.println("Wt Ht BMI Status");
  for(int i=0;i<10;i++){
   double h=data[i][1]/100.0;
   double bmi=data[i][0]/(h*h);
   System.out.printf("%.1f %.1f %.2f %s
",data[i][0],data[i][1],bmi,status(bmi));
  }
 }
}
