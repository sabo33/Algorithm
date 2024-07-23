import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0;
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=4; i>0; i--){
            int temp=0;
           for(int j=0; j<i; j++){
               if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
        }
        for(int i=0; i<5; i++){
            sum+=arr[i];
        }
        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}