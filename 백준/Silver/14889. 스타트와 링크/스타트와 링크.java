import java.util.Scanner;

public class Main {
    static int n;
    static int[][] board;
    static boolean[] visit;
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        visit = new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                board[i][j]=sc.nextInt();
            }
        }
        check(0,0);
        System.out.println(min);
    }
    public static void check(int index, int cnt){
        if(cnt==n/2){
            solve();
            return;
        }
        for(int i=index; i<n; i++){
            if(!visit[i]){
                visit[i]=true;
                check(i+1,cnt+1);
                visit[i]=false;
            }
        }
    }
    public static void solve(){
        int start=0;
        int link=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(visit[i]&&visit[j]){
                    start+=board[i][j];
                    start+=board[j][i];
                }
                else if(!visit[i]&&!visit[j]){
                    link+=board[i][j];
                    link+=board[j][i];
                }
            }
        }
        int result = Math.abs(start-link);
        if(result==0){
            min=result;
        }
        else{
            min=Math.min(result,min);
        }
    }
}
