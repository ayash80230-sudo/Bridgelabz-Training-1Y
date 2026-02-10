package com.gla.String;


import java.util.*;
public class StudentGradeCard{
    static String grade(double p){
        if(p>=80)return "A";
        if(p>=70)return "B";
        if(p>=60)return "C";
        if(p>=50)return "D";
        if(p>=40)return "E";
        return "R";
    }
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            int p=(int)(Math.random()*100);
            int c=(int)(Math.random()*100);
            int m=(int)(Math.random()*100);
            double per=(p+c+m)/3.0;
            System.out.println(p+" "+c+" "+m+" "+Math.round(per)+" "+grade(per));
        }
    }
}
