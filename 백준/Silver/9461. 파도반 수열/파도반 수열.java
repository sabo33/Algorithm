import java.util.Scanner;

public class Main {
    static long dp[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp=new long[101];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            System.out.println(solve(num));
        }
    }
    public static long solve(int n){
        if(n==1 || n==2 || n==3){
            return 1;
        }
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        for(int i=4; i<=n; i++){
            dp[i]=dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
