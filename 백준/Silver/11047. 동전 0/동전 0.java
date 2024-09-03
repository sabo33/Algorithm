import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1; i>=0; i--){
            if(k/arr[i]>0){
                result += k/arr[i];
                k=k%arr[i];
            }
        }
        System.out.println(result);
    }
}