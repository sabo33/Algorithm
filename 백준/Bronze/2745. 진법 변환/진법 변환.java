import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String text = st.nextToken();
        int dec = Integer.parseInt(st.nextToken());
        int sum=0;
        int cnt=1;
        for(int i=text.length()-1; i>=0; i--){
           char c = text.charAt(i);
           if('A'<=c && c<='Z'){
               sum+=(c-'A'+10)*cnt;
           }else{
               sum+=(c-'0')*cnt;
           }
           cnt*=dec;
        }
        System.out.println(sum);
    }
}