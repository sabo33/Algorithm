import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            int number = i;
            int result=0;
            while(number!=0){
                result+=number%10;
                number/=10;
            }
            if(result+i==n){
                System.out.print(i);
                return;
            }
        }
        System.out.println(0);
    }
}