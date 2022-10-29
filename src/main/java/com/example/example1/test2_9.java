package com.example.example1;



public class test2_9 {
    public static void main(String args[]){
        int[]a={0,31,28,31,30,31,30,31,31,30,31,30,31};//1~12月每月天数
        int[]b=new int[7];
        b[1]=1;//1901年1月1日是星期二
        int t=1;
        int m;
        for(int i=1901;i<=2000;i++){
            if(i%4==0&&i%400!=0) a[2]=29;
            else a[2]=28;
            for(int j=1;j<=12;j++){
                if(i==2000&&j==12) break;//这种情况其实算的是2001年1月1日是星期几
                m=a[j]%7;
                b[(m+t)%7]++;
                t=(m+t)%7;//每月的t根据上月首日是星期几来决定
            }
        }
        System.out.println(b[6]);
    }
}
