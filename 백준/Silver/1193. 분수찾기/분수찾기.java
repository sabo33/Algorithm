import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int step = 0;
        int val =0;
        int a = 0;
        int b =0;
        while(val<num){
            step++;
            val=step*(step+1)/2;
        }
        if(step%2!=0){
            a=1+val-num;
            b=step+num-val;
        }
        else{
            b=1+val-num;
            a=step+num-val;
        }
        System.out.println(a+"/"+b);
    }
}