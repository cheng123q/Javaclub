package com.example.example1;

import java.math.BigInteger;

public class test2_6 {
    public static void main(String[] args) {
        BigInteger first = new BigInteger("2");
        BigInteger end = new BigInteger("1");
        int i = 1;
        while (i <= 1000) {
            end = end.multiply(first);
            i++;
        }
        int sum = 0;
        String str = end.toString();

        for (int j = 0; j < str.length(); j++) {
            char temp = str.charAt(j);
            int t = temp - '0';
            sum += t;
        }
        System.out.println(sum);

    }
}
