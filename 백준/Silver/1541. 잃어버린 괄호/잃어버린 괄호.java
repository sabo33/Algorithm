import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(sc.nextLine(),"-");
        while(st.hasMoreTokens()){
            int temp = 0;
            StringTokenizer add = new StringTokenizer(st.nextToken(),"+");
            while(add.hasMoreTokens()){
                temp+=Integer.parseInt(add.nextToken());
            }
            if(result == Integer.MAX_VALUE){
                result = temp;
            }
            else{
                result -= temp;
            }
        }
        System.out.println(result);
    }
}