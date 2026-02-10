package com.gla.String;


public class VotingCheck{
    public static void main(String[] args){
        int[] age=new int[10];
        for(int i=0;i<10;i++) age[i]=(int)(Math.random()*60);
        for(int i=0;i<10;i++)
            System.out.println(age[i]+" "+(age[i]>=18));
    }
}
