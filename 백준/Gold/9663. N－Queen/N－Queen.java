import java.util.Scanner;

public class Main {
    static int n;
    static int result=0;
    static int[] arr;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr=new int[n];
        solve(0);
        System.out.println(result);
    }
    public static void solve(int cnt){
        if(n==cnt){
            result++;
            return;
        }
        for(int i=0; i<n; i++){
            arr[cnt]=i;
            if(check(cnt)){
                solve(cnt+1);
            }
        }
    }
    static boolean check(int cnt){
        for(int i=0; i<cnt; i++){
            if(arr[i]==arr[cnt]||Math.abs(arr[i]-arr[cnt])==Math.abs(i-cnt)) {
                return false;
            }
        }
        return true;
    }

}