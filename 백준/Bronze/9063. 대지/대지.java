import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] x=new int[t];
        int[] y=new int[t];
        if(t==1){
            System.out.println(0);
            return;
        }
        for(int i=0; i<t; i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println((x[t-1]-x[0])*(y[t-1]-y[0]));
    }
}