package com.google.challenges;
public class Solution {
    public static String solution(String x) {
        int n=Integer.parseInt(x);
        int dp[] = new int[1000];
        int z=countways(n,dp);
        String s=Integer.toString(z);
        return s;
    }
    
    static int countways(int n,int dp[]){
       if(n==1) return 0; // Base Case
       
       if(dp[n]!=0) return dp[n]; // Dp Lookup

       if(n%2==0) return countways(n/2,dp) + 1; //op1
       int ans = Math.min(countways(n-1,dp),countways(n+1,dp)) + 1; // min(op2,op3)
       return dp[n] = ans; //stored in dp array before returning
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String s = solution(x);
        System.out.println(s);
    }
}
