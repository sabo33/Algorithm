import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int map[][];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result=0;

    static class virus {
        int x, y;

        virus(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        map = new int[N][M];
        int[][] copyMap = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        copyMap = map;
        DFS(0, N, M);
        System.out.println(result);

    }

    public static void DFS(int depth, int N, int M) {
        if (depth == 3) {
            BFS(N, M);
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    DFS(depth + 1, N, M);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void BFS(int N, int M) {
        int[][] virusMap = new int[N][M];
        Queue<virus> queue = new LinkedList<virus>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                virusMap[i][j] = map[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusMap[i][j] == 2) {
                    queue.add(new virus(i, j));
                }

            }
        }
        while (!queue.isEmpty()) {
            virus v = queue.remove();
            for (int i = 0; i < 4; i++) {
                int n = v.x + dx[i];
                int m = v.y+dy[i];
                if(n>=0 && m>=0 && n<N && m<M){
                    if(virusMap[n][m]==0){
                        virusMap[n][m]=2;
                        queue.add(new virus(n,m));
                    }
                }
            }

        }
        safeArea(virusMap,N,M);
    }
    public static void safeArea(int[][]virusMap,int N, int M){
        int count=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(virusMap[i][j]==0) count++;
            }
        }
        result=Math.max(count,result);
    }

}