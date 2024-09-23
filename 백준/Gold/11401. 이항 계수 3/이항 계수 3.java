import java.util.Scanner;

public class Main{
    static long P = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = fact(a);
        long k = fact(b) * fact(a-b)%P;
        System.out.println(n*pow(k,P-2)%P);
    }
    public static long fact(long a){
        long fac = 1L;
        while(a>1){
            fac = (fac * a)% P;
            a--;
        }
        return fac;
    }
    public static long pow(long a,long b) {
        if(b == 1){
            return a%P;
        }
        long temp = pow(a,b/2);
        if(b%2==1){
            return (temp*temp%P) * a%P;
        }
        return temp*temp %P;
    }
}
