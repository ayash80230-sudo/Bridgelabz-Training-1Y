package com.gla.String;


import java.util.Scanner;
public class TrimManual{
    static String manualTrim(String s){
        int start=0,end=s.length()-1;
        while(start<s.length()&&s.charAt(start)==' ') start++;
        while(end>=0&&s.charAt(end)==' ') end--;
        String r="";
        for(int i=start;i<=end;i++) r+=s.charAt(i);
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(manualTrim(s).equals(s.trim()));
    }
}
