import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int gcd=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dist = new int[n-1];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            dist[i]=arr[i+1]-arr[i];
        }
        gcd=GCD(dist[0],dist[1]);
        for(int i=2; i<n-1; i++){
            gcd=GCD(gcd,dist[i]);
        }
        int sum=0;
        for(int i=0; i<n-1; i++){
            sum+=((dist[i]/gcd)-1);
        }
        System.out.println(sum);
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
}