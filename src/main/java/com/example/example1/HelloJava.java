package com.example.example1;

import java.util.Scanner;

public class HelloJava {
    private final static double VERSION = 1.0;

    public static void main(String[] args) {
        System.out.println("....");
        double sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
            count++;
        }
        System.out.println(String.format("%d个数平均%.2f", count, sum / count));
    }

}
