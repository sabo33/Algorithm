import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int number = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb =new StringBuilder();
        while(number!=0){
            if(number%B>=10) sb.append((char)((number%B)+55));
            else sb.append(number%B);
            number/=B;
        }
        System.out.println(sb.reverse());
    }
}