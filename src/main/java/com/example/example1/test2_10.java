package com.example.example1;

import java.math.BigInteger;

public class test2_10 {
    public static void main(String args[]){
        BigInteger num=BigInteger.ONE;
        for (BigInteger n=BigInteger.valueOf(100);n.compareTo(BigInteger.ZERO)>0;n=n.subtract(BigInteger.ONE))
            num=num.multiply(n);
        String s= num.toString();
        int sum=0;
        for (int i=0;i<s.length();i++)
            sum+=s.charAt(i)-'0';
        System.out.println(sum);
    }
}
