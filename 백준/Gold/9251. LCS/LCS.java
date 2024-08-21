import java.util.Scanner;


public class Main {
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        System.out.println(solve(x,y));
    }
    public static int solve(String x, String y){
       int n = x.length();
       int m = y.length();
       dp= new int[n+1][m+1];

       for(int i=1; i<=n; i++) {
           for (int j = 1; j <= m; j++) {
               if (x.charAt(i - 1) == y.charAt(j - 1)) {
                   dp[i][j] = dp[i - 1][j - 1] + 1;
               } else {
                   dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
               }
           }
       }
       return dp[n][m];
    }
}
