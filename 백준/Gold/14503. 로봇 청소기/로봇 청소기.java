import java.util.Scanner;

public class Main {
    static int n,m;
    static int[][] map;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int count =1;


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j]=sc.nextInt();
            }
        }
        run(x,y,d);
        System.out.println(count);

    }
    public static void run(int x, int y, int d){
     map[x][y]=2;
     for(int i=0; i<4; i++){
         d-=1;
         if(d==-1) d=3;
         int nx = x+dx[d];
         int ny = y+dy[d];
         if(nx>=0 && ny>=0 && nx<n && ny<m){
             if(map[nx][ny]==0){
                 count++;
                 run(nx,ny,d);
                 return;
             }
         }
     }
     int dir = (d+2)%4;
     int back_x = x+dx[dir];
     int back_y = y+dy[dir];

     if(back_x>=0 && back_y>=0 && back_x<n && back_y<m && map[back_x][back_y]!=1) run(back_x,back_y,d);
    }
}