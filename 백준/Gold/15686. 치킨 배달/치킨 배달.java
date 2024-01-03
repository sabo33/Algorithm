import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static int[][] map;
    static int N,M;
    static int result = Integer.MAX_VALUE;
    static ArrayList<point> home = new ArrayList<>();
    static ArrayList<point> chicken = new ArrayList<>();
    static boolean[] visited;
    public static class point{
        int x;
        int y;
        public point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
        sc.nextLine();
        map = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int num = sc.nextInt();
                map[i][j]=num;
                if(map[i][j]==1){
                    home.add(new point(i,j));
                }
                else if(map[i][j]==2){
                    chicken.add(new point(i,j));
                }
            }
        }
        visited = new boolean[chicken.size()];
        back(0,0);
        System.out.println(result);
    }
    public static void back(int depth, int cnt){
        if(depth==M){
            int total = 0;
            for(int i=0; i< home.size(); i++){
                int sum = Integer.MAX_VALUE;
                for(int j=0; j< chicken.size(); j++){
                    if(visited[j]==true){
                        int distance = Math.abs(home.get(i).x - chicken.get(j).x)
                                +Math.abs(home.get(i).y- chicken.get(j).y);
                        sum = Math.min(sum,distance);
                    }
                }
                total += sum;
            }
            result = Math.min(total, result);
            return;
        }
        for(int i = cnt; i< chicken.size(); i++){
            if(visited[i]==false){
                visited[i]=true;
                back(depth+1,i+1);
                visited[i]=false;
            }
        }
    }
}