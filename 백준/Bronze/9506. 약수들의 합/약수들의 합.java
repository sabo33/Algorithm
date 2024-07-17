import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int cnt=0;
            int sum=0;
            if(a==-1) break;
            for(int i=1; i<=a; i++){
                if(a%i==0 && a!=i){
                    cnt++;
                    sum+=i;
                    sb.append(i);
                    sb.append(" + ");
                }
            }
            if(sum==a){
                sb.delete(sb.length()-3,sb.length()-1);
                System.out.println(a+" = "+sb);
            }else System.out.println(a +" is NOT perfect.");
        }
    }
}