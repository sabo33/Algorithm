import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;
        int min=99999;

        for(int i=m; i<=n; i++){
            int j;
            for(j=2; j<i; j++){
                if(i%j==0) break;
            }
            if(i==j){
                sum+=i;
                if(min>i)min=i;
            }
        }
        if(min==99999){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}