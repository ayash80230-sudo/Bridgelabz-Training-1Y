package com.gla.String;


import java.util.*;
public class RockPaperScissors{
    static String[] opt={"rock","paper","scissors"};
    static String comp(){return opt[(int)(Math.random()*3)];}
    static int win(String u,String c){
        if(u.equals(c)) return 0;
        if(u.equals("rock")&&c.equals("scissors")||u.equals("paper")&&c.equals("rock")||u.equals("scissors")&&c.equals("paper")) return 1;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int u=0,c=0;
        for(int i=0;i<n;i++){
            String user=sc.next();
            String comp=comp();
            int r=win(user,comp);
            if(r==1)u++; else if(r==-1)c++;
        }
        System.out.println("User="+u+" Computer="+c);
    }
}
