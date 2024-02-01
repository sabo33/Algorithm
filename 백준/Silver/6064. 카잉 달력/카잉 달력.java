import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++)
        {
            boolean check=false;
            int m=sc.nextInt();
            int n=sc.nextInt();
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            int range = m*n/gcd(m,n);

            for(int j=x; j<range; j+=m){
                if(j%n==y){
                    System.out.println(j+1);
                    check=true;
                    break;
                }
            }
            if(!check) System.out.println("-1");
        }
    }
    public static int gcd(int n,int m){
        if(m==0) return n;
        return gcd(m, n%m);
    }
}