import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        int[] value = new int[city-1];
        int[] pay = new int[city];
        for(int i=0; i<city-1; i++){
            value[i] = sc.nextInt();
        }
        for(int i=0; i<city; i++){
            pay[i] = sc.nextInt();
        }
        long minPrice = pay[0];
        long answer = 0;
        for(int i =0; i<city-1; i++){
            answer+=(value[i] * minPrice);
            minPrice = Math.min(minPrice,pay[i+1]);
        }
        System.out.println(answer);
    }
}