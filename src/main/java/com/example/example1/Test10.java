package com.example.example1;

public class Test10 {
    private final static int MAX = 2000000;
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
    public static void main(String args[]){
        long num=0;
        long i;
        for (i=2;i<MAX;i++){
            if(isPrime(i))num+=i;
        }
        System.out.println(num);
    }
}
