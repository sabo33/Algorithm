import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        sb.append(LCM(a,b));
        System.out.println(sb);
    }
    public static long GCD(long a, long b){
        long r;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static long LCM(long a, long b){
        return(a*b)/GCD(a,b);
    }
}