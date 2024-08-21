import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][2];
        dp = new int[n];
        int[] sequence = new int[n];

        for(int i=0; i<n; i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0; i<n; i++){
            sequence[i]=arr[i][1];
        }
        System.out.println(n-solve(sequence));
    }
    public static int solve(int[] arr){
        Arrays.fill(dp,1);
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = 0;
        for(int i : dp){
            max = Math.max(max,i);
        }
        return  max;
    }
}
