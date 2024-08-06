import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt=0;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        hanoi(n,1,3,2);
        System.out.println(cnt);
        System.out.println(sb);

    }
    public static void hanoi(int n , int from , int to , int mid){
        cnt++;
        if(n==1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        hanoi(n-1,from,mid,to);
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(n-1,mid,to,from);
    }
}
