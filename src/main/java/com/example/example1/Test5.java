package com.example.example1;

public class Test5 {
    public static void main(String args[]){
        long i ,num;
        num=1;
        for (i=2;i<=20;i++){
            num=num*i/MaxDivisor(num,i);
        }
System.out.println(num);
    }
    public static long MaxDivisor(long n,long m){
        long temp;
        while (m!=0){
            temp = n%m;
            n=m;
            m=temp;
        }
return n;
    }
}
