import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = a.charAt(j)-'0';
            }
        }
        solve(0, 0, n);
        System.out.println(sb.toString());
    }

    public static void solve(int row, int col, int size) {
        if (size == 1) {
            sb.append(map[row][col]);
            return;
        }

        int cnt = 0;
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                cnt += map[i][j];
            }
        }

        if (cnt == size * size) {
            sb.append("1");
            return;
        }
        if (cnt == 0) {
            sb.append("0");
            return;
        }

        sb.append("(");
        int newSize = size / 2;
        solve(row, col, newSize);
        solve(row, col + newSize, newSize);
        solve(row + newSize, col, newSize);
        solve(row + newSize, col + newSize, newSize);
        sb.append(")");
    }
}
