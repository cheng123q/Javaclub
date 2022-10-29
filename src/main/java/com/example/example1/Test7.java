package com.example.example1;

public class Test7 {
    public static void main(String args[]){
        long num,i;
        num=0;
        i=1;
        while(num<10001){
            i++;
            if(isPrime(i))
                num++;

        }
        System.out.println(i);
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
