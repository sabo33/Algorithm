import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=n; i<=m; i++){
            if(isPrime(i)){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static boolean isPrime(long a){
        if(a<2) return false;
        if(a==2) return true;
        for(int i=2; i<Math.sqrt(a)+1; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}