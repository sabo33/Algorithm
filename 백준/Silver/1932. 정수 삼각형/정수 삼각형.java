import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        dp = new int[n+1][n+1];
        for(int i=1;  i<=n; i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for(int j=1; j<=i; j++){
                dp[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solve(dp));

    }
    public static int solve(int[][] dp){
        int n = dp.length;
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                dp[i][j] += Math.max(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}
