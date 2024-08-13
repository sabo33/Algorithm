import java.util.Scanner;

public class Main {
    static long[][] dp;
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       dp = new long[n+1][10];
       for(int j=1; j<10; j++){
           dp[1][j]=1;
       }
       System.out.println(solve(n));
    }
    public static long solve(int n){
        for(int i=2; i<=n; i++){
            for(int j=0; j<10; j++){
                if(j>0){
                    dp[i][j]+=dp[i-1][j-1];
                }
                if(j<9){
                    dp[i][j]+=dp[i-1][j+1];
                }
                dp[i][j]%=1000000000;
            }
        }
        long result=0;
        for(int j=0; j<10; j++){
            result+=dp[n][j];
        }
        result%=1000000000;
        return result;
    }
}
