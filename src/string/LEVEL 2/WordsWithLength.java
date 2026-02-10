package com.gla.String;


import java.util.Scanner;
public class WordsWithLength{
    static String[][] get(String s){
        String[] w=s.split(" ");
        String[][] res=new String[w.length][2];
        for(int i=0;i<w.length;i++){
            res[i][0]=w[i];
            res[i][1]=String.valueOf(w[i].length());
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] r=get(s);
        for(int i=0;i<r.length;i++)
            System.out.println(r[i][0]+" "+r[i][1]);
    }
}
