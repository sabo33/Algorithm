import java.util.Scanner;

public class Main {
    static int dp[][][] = new int[21][21][21];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==-1 && c==-1 && b==-1){
                break;
            }
            System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,solve(a,b,c));
        }

    }
    public static int solve(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0){
            return 1;
        }
        if(a>20 || b>20|| c>20){
            return dp[20][20][20] = solve(20,20,20);
        }
        if(dp[a][b][c]!=0){
            return dp[a][b][c];
        }
        if(a<b && b<c){
            return dp[a][b][c]=solve(a,b,c-1)+solve(a,b-1,c-1)-solve(a,b-1,c);
        }
        return dp[a][b][c] = solve(a-1,b,c)+solve(a-1,b-1,c)+solve(a-1,b,c-1)-solve(a-1,b-1,c-1);
    }

}
