import java.util.Scanner;

public class Main {
    static int[] f;
    static int cnt=0,cnt2=0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f = new int[n+1];
        int a = fibo(n);
        int b = fib(n);
        System.out.println(cnt);
        System.out.println(cnt2);
    }
    public static int fibo(int n){
        if(n==1 || n==2){
            cnt++;
            return 1;
        }
        else return fibo(n-1)+fibo(n-2);
    }
    public static int fib(int n){
        f[1]=f[2]=1;
        for(int i=3; i<=n; i++){
            cnt2++;
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}
