import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]!=1&&arr[n-1]!=n)
            System.out.println(arr[0]*arr[n-1]);
        else{
            System.out.println(arr[n-1]);
        }
    }
}

