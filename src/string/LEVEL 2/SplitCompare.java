package com.gla.String;


import java.util.Scanner;
public class SplitCompare{
    static String[] manual(String s){
        int spaces=0;
        for(int i=0;i<s.length();i++) if(s.charAt(i)==' ') spaces++;
        String[] words=new String[spaces+1];
        String temp=""; int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){words[index++]=temp; temp="";}
            else temp+=s.charAt(i);
        }
        words[index]=temp;
        return words;
    }
    static boolean compare(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(compare(manual(s),s.split(" ")));
    }
}
