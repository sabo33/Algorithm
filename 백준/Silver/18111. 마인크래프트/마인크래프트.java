import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int min=256;
        int max=0;
        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                if(map[i][j]<min) min=map[i][j];
                if(map[i][j]>max)max=map[i][j];
            }
        }
        int max_height=0;
        int min_time=100000000;

        for (int height = min; height <= max; height++) {
            int del = 0;
            int inc = 0;
            int inventory = b;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] < height) {
                        inc += height - map[i][j];
                        inventory -= height - map[i][j];
                    } else if (map[i][j] > height) {
                        del += map[i][j] - height;
                        inventory += map[i][j] - height;
                    }
                }
            }
            if (inventory < 0) {
                continue ;
            }
            int time = del * 2 + inc;
            if (time <= min_time && height >= max_height) {
                min_time = time;
                max_height = height;
            }
        }
        System.out.println(min_time+" "+max_height);


    }
}