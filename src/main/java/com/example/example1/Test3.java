package com.example.example1;

import java.util.Scanner;

public class Test3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long i;
        long max_prime = 0;
        for (i=2;i<=Math.sqrt(n);i++){
            if(n%i==0&&isPrime(i))
                max_prime = i;
        }
System.out.println(max_prime);
    }






    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;

    }
}
