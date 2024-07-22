import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        while(true){
            if(a%5==0){
                System.out.println(a/5+cnt);
                break;
            }
            else if(a<0){
                System.out.println(-1);
                break;
            }
            a-=3;
            cnt++;
        }
    }
}