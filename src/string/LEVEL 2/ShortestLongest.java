package com.gla.String;


import java.util.Scanner;
public class ShortestLongest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] w=s.split(" ");
        String small=w[0],big=w[0];
        for(int i=1;i<w.length;i++){
            if(w[i].length()<small.length()) small=w[i];
            if(w[i].length()>big.length()) big=w[i];
        }
        System.out.println("Shortest="+small);
        System.out.println("Longest="+big);
    }
}
