import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                arr[i][j]=sc.nextInt();
                sum[i][j]=arr[i][j]+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
            }
        }
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int result = sum[x2][y2] - sum[x-1][y2] - sum[x2][y-1] +sum[x-1][y-1];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
