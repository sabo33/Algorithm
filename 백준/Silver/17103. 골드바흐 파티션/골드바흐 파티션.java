import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] primes = new boolean[1000001];
        primes[0]=primes[1]=true;
        for(int i=2; i*i<=1000000; i++){
            if(!primes[i]){
                for(int j=i+i; j<=1000000; j+=i){
                    primes[j]=true;
                }
            }
        }
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            int cnt=0;
            for(int j=2; j<=m/2; j++){
                if(!primes[j]&&!primes[m-j]) cnt++;
            }
            System.out.println(cnt);
        }
    }

}