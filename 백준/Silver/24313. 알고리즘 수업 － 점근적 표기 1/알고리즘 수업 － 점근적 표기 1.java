import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a_1 = sc.nextInt();
        int a_0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if(a_1*n+a_0<=c*n && a_1<=c){
            System.out.println(1);
        }else System.out.println(0);
    }
}