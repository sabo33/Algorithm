import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] money = {25,10,5,1};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] result = new int[T][4];
        for(int i=0; i<T; i++){
            int sent = sc.nextInt();
            for(int j=0; j<4; j++){
                result[i][j]=sent/money[j];
                sent%=money[j];
            }
        }
        for(int i=0; i<T; i++){
            for(int j=0; j<4; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}