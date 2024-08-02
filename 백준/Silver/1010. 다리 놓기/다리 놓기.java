import java.math.BigInteger;
import java.util.Optional;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            String s = sc.nextLine();
            int n = Integer.parseInt(s.split(" ")[0]);
            int m = Integer.parseInt(s.split(" ")[1]);
            sb.append(Operation(n,m)).append("\n");
        }
        System.out.println(sb);
    }
    public static BigInteger Operation(int m, int n){
        BigInteger result = BigInteger.ONE;
        BigInteger div = BigInteger.ONE;
        while(m>=1){
            result=result.multiply(BigInteger.valueOf(n--));
            div=div.multiply(BigInteger.valueOf(m--));
        }
        return result.divide(div);
    }
}

