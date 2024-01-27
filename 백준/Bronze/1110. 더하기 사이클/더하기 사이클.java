import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int n2 = n;
        while(true){
            n=((n%10)*10)+(((n%10)+(n/10))%10);
            count++;
            if(n==n2){
                break;
            }
        }
        System.out.println(count);
    }
}