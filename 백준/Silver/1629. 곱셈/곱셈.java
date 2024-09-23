import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(solve(a,b,c));
    }
    public static long solve(long a, long b, long c){
        if(b==1){
            return a%c;
        }
        long temp = solve(a,b/2,c)%c;
        if(b%2 ==0){
            return (temp*temp)%c;
        }
        else return (temp*(solve(a,b/2+b%2,c)%c))%c;
    }
}