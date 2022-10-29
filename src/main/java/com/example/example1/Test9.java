package com.example.example1;

public class Test9 {
    public static void main(String args[]){
        int n=1000;
        int a,b,c;
        boolean flag=true;
        for(c=n/3;c<n/2&&flag;c++){
            int temp=n-c;
            for (a=1,b=temp-a;b>=a;a++,b--){
                if (a<=c&&b<=c){
                    if(a*a+b*b==c*c){
                        flag=false;
                        System.out.println(a*b*c);
                        break;
                    }
                }
            }
        }
    }
}
