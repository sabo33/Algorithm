import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();
        if(m==1) return;
        for(int i=2; i<=m; i++){
            while(m%i==0){
                m/=i;
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
}