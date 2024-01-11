import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    static char[][] map;
    static int max = 1;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        map = new char[count][count];

        for(int i=0; i<count; i++){
            String str=br.readLine();
            for(int j=0; j<count; j++){
                map[i][j]=str.charAt(j);
            }
        }
        for(int i=0; i<count; i++){
            for(int j=0; j<count-1; j++){
                swap(i,j,i,j+1);
                Search();
                swap(i,j+1,i,j);
            }
        } 
        for(int i=0; i<count-1; i++){
            for(int j=0; j<count; j++){
                swap(i,j,i+1,j);
                Search();
                swap(i+1,j,i,j);
            }
        }
        
        System.out.println(max);
    }
    public static void swap(int x1, int y1, int x2, int y2){
        char temp = map[x1][y1];
        map[x1][y1]=map[x2][y2];
        map[x2][y2]=temp;
    }
    public static void Search(){
        for(int i=0; i<map.length; i++){
            int cnt =1;
            for(int j=0; j<map.length-1; j++){
                if(map[i][j]==map[i][j+1]){
                    cnt++;
                    max=Math.max(cnt,max);
                }else cnt=1;
            }
        }
        for(int i=0; i<map.length; i++){
            int cnt =1;
            for(int j=0; j<map.length-1; j++){
                if(map[j][i]==map[j+1][i]){
                    cnt++;
                    max=Math.max(cnt,max);
                }else cnt=1;
            }
        }
    }
}