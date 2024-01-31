import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] result = new int[11];
        int testSet = sc.nextInt();
        result[1]=1; result[2]=2; result[3]=4;
        for(int i=4; i<11; i++){
            result[i]=result[i-3]+result[i-2]+result[i-1];
        }

        for(int i=0; i<testSet; i++){
            int num = sc.nextInt();
            System.out.println(result[num]);
        }
    }
}