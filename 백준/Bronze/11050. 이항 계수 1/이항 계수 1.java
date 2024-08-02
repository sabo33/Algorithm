import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 1;
        int div = 1;
        while(m>=1){
            result*=n--;
            div*=m--;
        }
        System.out.println(result/div);
    }
}

