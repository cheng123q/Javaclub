package com.example.example1;

public class Test2 {
    private final static int MAX = 4000000;
    public static void main(String args[]){
        int i=1;
        int sum=0;
        int n;
        while(fib(i)<MAX){
            n=fib(i);
            if(n%2==0)
                sum+=n;
            i++;
        }
System.out.println(sum);
    }


  public static int fib(int n) {
        if(n==1)
            return 1;
        if (n==2)
            return 2;
        return fib(n-1)+ fib(n-2);

    }
}
