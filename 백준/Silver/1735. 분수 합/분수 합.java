import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int A = a*d+c*b;
        int B = b*d;
        int gcd = GCD(A,B);
        System.out.println(A/gcd+" "+B/gcd);

    }
    public static int GCD(int a, int b){
        int r;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int LCM(int a, int b){
        return(a*b)/GCD(a,b);
    }
}