import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[n][m];
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            for(int j=0; j<line.length(); j++){
                board[i][j]=line.charAt(j);
            }
        }
        int[][] sumW = new int[n+1][m+1];
        int[][] sumB = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                boolean check  = (i+j)%2==0;
                char current = board[i-1][j-1];
                sumW[i][j] = sumW[i-1][j] + sumW[i][j-1] - sumW[i-1][j-1];
                sumB[i][j] = sumB[i-1][j] + sumB[i][j-1] - sumB[i-1][j-1];
                if((check && current!='W')|| (!check && current!='B')){
                    sumW[i][j]++;
                }
                if((check && current!='B') || (!check && current!='W')) {
                    sumB[i][j]++;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=k ; i<=n; i++){
            for(int j=k; j<=m; j++){
                int W = sumW[i][j] - sumW[i-k][j] - sumW[i][j-k] + sumW[i-k][j-k];
                int B = sumB[i][j] - sumB[i-k][j] - sumB[i][j-k] + sumB[i-k][j-k];
                min = Math.min(min,Math.min(W,B));
            }
        }
        System.out.println(min);
    }
}