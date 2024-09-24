import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        m = sc.nextInt();
        int k = sc.nextInt();
        int[][] B = new int[m][k];
        int[][] result = new int[n][k];
        for(int i=0; i<m; i++){
            for(int j=0; j<k; j++){
                B[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int r = A[j][i];
                for(int t=0; t<k; t++){
                    result[j][t] += r * B[i][t];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}