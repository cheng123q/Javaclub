package com.example.example1;

public class test2_4 {
    public static void main(String args[]) {
        int max = 0;
        int n = 0;
        for (int i = 1; i < 1000000; i++) {
            if (Collatz(i) > max) {
                n = i;
                max = Collatz(i);
            }
        }
        System.out.println(n);
    }

    public static int Collatz(int i) {
        int num = 1;
        do {
            if (i % 2 == 0)
                i /= 2;
            else i = 3 * i + 1;
            num++;
        } while (i > 1);
        return num;
    }
}
