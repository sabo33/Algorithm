import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a=0,b=0,c=0;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a==0) break;
            int[] arr ={a,b,c};
            Arrays.sort(arr);
            if(arr[2]<arr[0]+arr[1]){
                if(a==b&&b==c){
                    sb.append("Equilateral");
                }
                else if(a==b||a==c||b==c){
                    sb.append("Isosceles");
                }
                else sb.append("Scalene");
            }else sb.append("Invalid");
            sb.append("\n");

        }
        System.out.println(sb);
    }
}