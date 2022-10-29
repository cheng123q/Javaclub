package com.example.example1;

public class Test4 {
    public static void main(String args[]){
        int i ,j;
        int max = 0;
        for (i=999;i>=100;i--){
            for (j=999;j>=100;j--){
                String s= String.valueOf(i*j);
                if (isPalindrome(s)&&max<i*j)
                    max=i*j;
            }
        }
        System.out.println(max);
    }
    public static boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString().equals(s);

    }
}
