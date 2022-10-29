package com.example.example1;

public class test2_7 {
    public static long num(int n) {
        int[] aaa = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8, 6};//1~20
        long[] b = new long[n + 1];
        for (int i = 1; i < n + 1; i++) {
            if (i >= 1 && i <= 20) b[i] = aaa[i];
            else if (i == 40) b[i] = 5;
            else if (i%10==0&i<100)b[i]=b[i/10+10]-2;
                else if (i < 100) b[i] = aaa[i % 10] + b[i - i % 10];
            else if (i == 100) b[i] = 10;
            else if (i % 100 == 0 && i < 1000) b[i] = aaa[i / 100] + b[100] - 3;
            else if (i < 1000) b[i] = b[i - i % 100] + b[i % 100] + 3;
            else if (i == 1000) b[i] = 11;
        }
        long m = 0;
        System.out.println(b[80]);//测试
        System.out.println(b[89]);
        for (int i = 1; i <= n; i++) m += b[i];
        return m;
    }

    public static void main(String[] args) {
        long m = num(1000);
        System.out.println(m);
    }
}
