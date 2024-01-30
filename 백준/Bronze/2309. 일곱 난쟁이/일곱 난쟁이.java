import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int [] list = new int[9];
        for(int i=0; i<9; i++){
            list[i]=sc.nextInt();
            sum+=list[i];
        }
        Arrays.sort(list);
        int fake1=0,fake2=0;
        for(int i=0; i<list.length-1; i++){
            for(int j=i+1; j<list.length; j++){
                if(sum-list[i]-list[j]==100){
                    fake1=i;
                    fake2=j;
                    break;
                }
            }
        }
        for(int i=0; i<list.length; i++){
            if(i==fake1 || i==fake2){
                continue;
            }
            System.out.println(list[i]);
        }
    }
}