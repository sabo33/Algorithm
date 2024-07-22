import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int result=0;
        String title="";
        while(true){
            cnt+=1;
            title = String.valueOf(cnt);
            if(title.contains("666")){
                result+=1;
                if(result==n) break;
            }
        }
        System.out.println(title);
    }
}