import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc. nextInt();

        for(int i=0; i<10000; i++){
            if((i%15)+1==e && (i%28)+1==s && (i%19)+1==m)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}