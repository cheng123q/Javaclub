package com.example.example1;

import java.math.BigInteger;

public class test2_5 {//数学公式A（40，40）/A（20，20）/A（20，20）
    public static BigInteger fact(BigInteger n) {
        BigInteger mul = BigInteger.ONE;
        n = n.add(BigInteger.ONE);
        for (BigInteger i = new BigInteger("2"); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            mul = mul.multiply(i);
        }
        return mul;
    }

    public static void main(String args[]){
        BigInteger a =fact(BigInteger.valueOf(40));
        BigInteger b=fact(BigInteger.valueOf(20));
        BigInteger c=a.divide(b);
        BigInteger d=c.divide(b);


    System.out.println(d);
    }
}
