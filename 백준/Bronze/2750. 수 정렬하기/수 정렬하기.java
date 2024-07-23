import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=a-1; i>0; i--){
            int temp=0;
           for(int j=0; j<i; j++){
               if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
        }
        for(int i=0; i<a; i++){
            System.out.println(arr[i]);
        }
    }
}