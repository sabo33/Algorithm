import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long result=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));
    }
    public static long factorial(int n){
        if(n==1 || n==0){
            return result;
        }
        result*=n;
        n--;
        return factorial(n);
    }
}