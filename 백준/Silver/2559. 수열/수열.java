import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            sum+=arr[i];
        }
        int result = sum;
        for(int i=1; i<=n-m; i++){
            sum = sum - arr[i-1]+arr[i+m-1];
            if(sum>result)
                result=sum;
        }
        System.out.println(result);
    }
}
