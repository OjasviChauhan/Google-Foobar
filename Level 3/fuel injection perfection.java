package com.google.challenges;
public class Solution {
    public static String solution(String x) {
        int n=Integer.parseInt(x);
        int z=countways(n);
        String s=Integer.toString(z);
        return s;
    }
    static int countways(int n) { 
        if (n == 1) 
            return 0; 
        else if (n % 2 == 0) 
            return 1 + countways(n / 2); 
        else
            return 1 + Math.min(countways(n - 1),countways(n + 1)); 
    } 
}
