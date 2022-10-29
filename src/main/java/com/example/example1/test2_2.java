package com.example.example1;

public class test2_2 {
    public static void main(String args[]){
        int num=1,i=2;
        while(Number_Tran(num)<=500){
            num+=i;
            i++;
        }
        System.out.println(num);
        System.out.println(Number_Tran(num));
    }
    public static int Number_Tran(int n){
        int i,num=0;
        int m= (int) Math.sqrt(n);
        for (i=1;i<=m;i++){
            if(n%i==0)
                num+=2;
        }
        return num;
    }
}
