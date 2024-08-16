import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] val = new int[n];
        int[] weight = new int[n];
        sc.nextLine();
        dp = new int[n+1][k+1];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            weight[i]=Integer.parseInt(st.nextToken());
            val[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(k,weight,val,n));
    }
    public static int solve(int k, int[] weight, int[] val, int n){
        for(int i=1; i<=n; i++){
            for(int w=1; w<= k; w++){
                if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - weight[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][k];
    }
}
