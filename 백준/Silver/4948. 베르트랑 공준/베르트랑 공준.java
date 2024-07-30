import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int cnt=0;
            int a = Integer.parseInt(br.readLine());
            if(a==0)
            {
                break;
            }
            for(int i=a+1; i<=2*a; i++){
                if(isPrime(i)){
                   cnt++;
                }
            }
            sb.append(cnt).append("\n");
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