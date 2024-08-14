import java.util.Scanner;

public class Main {
    static int n;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        dp = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            dp[i]=arr[i];
        }
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j] && dp[i]<dp[j]+arr[i]){
                    dp[i]=dp[j]+arr[i];
                }
            }
        }
        int max = 0;
        for(int i : dp){
            max=Math.max(max,i);
        }
        return max;
    }
}
