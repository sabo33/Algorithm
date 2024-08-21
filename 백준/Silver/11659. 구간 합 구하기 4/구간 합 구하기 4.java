import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        sum[0] = 0;
        for(int i=1; i<=n; i++){
            arr[i]=sc.nextInt();
            sum[i]=sum[i-1]+arr[i];
        }
        for(int i=0; i<m; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            sb.append(sum[y]-sum[x-1]).append("\n");
        }
        System.out.println(sb);
    }
}
