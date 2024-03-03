import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] day = new int[n][2];
        int [] dp = new int[n+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                day[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            if(i+day[i][0]<=n)
            {
                dp[i+day[i][0]]=Math.max(dp[i+day[i][0]],dp[i]+day[i][1]);
            }
            dp[i+1]=Math.max(dp[i+1],dp[i]);
        }
        System.out.println(dp[n]);

    }

}