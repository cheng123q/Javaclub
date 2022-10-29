package com.example.example1;

public class Test6 {
    public static void main(String args[]){
        long num1,num2;
        num1=num2=0;
        for (int i=1;i<=100;i++){
            num1+=Math.pow(i,2);
            num2+=i;
        }

        num2=(long) Math.pow(num2,2);
        System.out.println(num2-num1);
    }

}
