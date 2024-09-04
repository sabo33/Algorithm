import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][2];
        int cnt = 1;
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });
        int time = arr[0][1];
        for(int i=1; i<n; i++){
            if(arr[i][0] >= time){
                cnt++;
                time = arr[i][1];
            }
            else if(arr[i][0] < time && arr[i][1]<time){
                time = arr[i][1];
            }
        }
        System.out.println(cnt);
    }
}