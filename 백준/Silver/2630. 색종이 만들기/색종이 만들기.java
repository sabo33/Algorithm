import java.util.Scanner;

public class Main{
    public static int white = 0;
    public static int blue = 0;
    public static int[][] map ;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        solve(0,0,n);
        System.out.println(white);
        System.out.println(blue);

    }
    public static void solve(int row, int col, int size){
        if(check(row,col,size)){
            if(map[row][col] == 0){
                white++;
            }
            else
                blue++;
            return;
        }
        int newSize = size/2;
        solve(row,col, newSize);
        solve(row,col+newSize, newSize);
        solve(row+newSize,col,newSize);
        solve(row+newSize,col+newSize,newSize);
    }
    public static boolean check(int row, int col, int size){
        int color = map[row][col];
        for(int i=row; i<size+row; i++){
            for(int j=col; j<col+size; j++){
                if(map[i][j] != color)
                    return false;
            }
        }
        return true;
    }
}