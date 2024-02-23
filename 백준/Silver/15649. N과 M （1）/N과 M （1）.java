import java.util.Scanner;

public class Main {
    static int[] arr;
    static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        visit = new boolean[n];

        dfs(n,m,0);
        System.out.println(sb);

    }
    public static void dfs(int n, int m, int depth){
        if(depth==m){
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i+1;
                dfs(n,m,depth+1);
                visit[i]=false;
            }
        }
    }
}