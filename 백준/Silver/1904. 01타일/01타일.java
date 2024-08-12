import java.util.Scanner;

public class Main {
    static int dp[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        System.out.println(solve(n));

    }
    public static int solve(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        dp[1]=1;
        dp[2]=2;
        for(int i=3; i<=n; i++){
            dp[i]=(dp[i-2]+dp[i-1])%15746;
        }
        return dp[n];
    }
}
