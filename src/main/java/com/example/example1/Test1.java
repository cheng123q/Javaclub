package com.example.example1;

public class Test1 {
    private final static int MAX = 1000;

    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 1; i <MAX; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
               // System.out.println(i);
            } else if (i % 3 == 0) {

                    sum += i;
                   // System.out.println(i);
                } else if (i % 5 == 0) {

                        sum += i;
                        //System.out.println(i);
                    }

                }
                System.out.println(sum);
            }
        }

