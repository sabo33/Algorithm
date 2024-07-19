import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] x = new int[3];
        int[] y = new int[3];
        for(int i=0; i<3; i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[0]==x[1]) {
          sb.append(x[2]+" ");
        }else sb.append(x[0]+" ");
        if(y[0]==y[1]) {
            sb.append(y[2]);
        }else sb.append(y[0]);

        System.out.println(sb);
    }
}