import java.util.Scanner;

public class Main {
    static int n;
    //static int[] dp; //증가하는 부분
    static int[] dp2; //감소하는 부분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        dp2= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            dp2[i]=1;
        }
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        for(int i=n-2; i>=0; i--){
            for(int j=n-1; j>i; j--){
                if(arr[i]>arr[j]){
                    dp2[i]=Math.max(dp2[i],dp2[j]+1);
                }
            }
        }
        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max,dp2[i]);
        }
        return  max;
    }
}
