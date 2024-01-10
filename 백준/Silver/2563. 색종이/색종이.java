import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s =0;
        int count = sc.nextInt();
        int[][] ground = new int[100][100];
        while (count-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = n; i < n+10; i++) {
                for (int j = m; j < m+10; j++) {
                    if(++ground[i][j]==1) s++;
                }
            }
        }

       System.out.println(s);
    }
}