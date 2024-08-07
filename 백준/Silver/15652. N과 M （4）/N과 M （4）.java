import java.util.Scanner;

public class Main {
    static int[] arr;
    static int n,m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];

        dfs(1,0);
        System.out.println(sb);

    }
    public static void dfs(int a, int depth){
        if(depth==m){
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }
        for(int i=a; i<=n; i++){
            arr[depth]=i;
            dfs(i,depth+1);
        }
    }
}