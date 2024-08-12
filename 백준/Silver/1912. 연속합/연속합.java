import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int dp[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        dp = new int[n];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            dp[i]=num;
        }
        System.out.println(solve(dp));
    }
    public static int solve(int[] arr){
        int max = arr[0];
        int current = arr[0];
        for(int i=1;i<arr.length; i++){
            current = Math.max(arr[i], arr[i]+current);
            max = Math.max(max,current);
        }
        return max;
    }
}
