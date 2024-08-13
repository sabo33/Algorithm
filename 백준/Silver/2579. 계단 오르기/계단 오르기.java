import java.util.Scanner;

public class Main {
    static int[] dp;
    static int[] score;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n];
        score = new int[n];
        for(int i=0; i<n; i++){
            score[i]=sc.nextInt();
        }
        System.out.println(solve(score));
    }
    public static int solve(int[] score){
       int n = score.length;
       if(n==1) return score[0];
       if(n==2) return score[0]+score[1];
       dp[0]=score[0];
       dp[1]=score[0]+score[1];
       dp[2]=Math.max(score[0]+score[2],score[1]+score[2]);
       for(int i=3; i<n; i++){
           dp[i]=Math.max(dp[i-2]+score[i],dp[i-3]+score[i-1]+score[i]);
       }
       return dp[n-1];
    }
}
