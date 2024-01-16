import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int test = sc.nextInt();
        long[] result = new long[test];
        for(int t=0; t<test; t++){
            long max=0;
            int day=sc.nextInt();
            long[] list = new long[day];
            for(int i=0; i<day; i++){
                list[i]=sc.nextInt();
            }
            for(int i=day-1; i>=0; i--) {
                if (list[i] > max) {
                    max = list[i];
                } else {
                    result[t]+=(max-list[i]);
                }
            }

        }
        for(long i : result){
            System.out.println(i);
        }

    }
}