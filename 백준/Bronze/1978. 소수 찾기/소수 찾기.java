import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int j;
            for(j=2; j<arr[i]; j++){
                if(arr[i]%j==0) break;
            }
            if(arr[i]==j) cnt++;
        }
        System.out.println(cnt);
    }
}