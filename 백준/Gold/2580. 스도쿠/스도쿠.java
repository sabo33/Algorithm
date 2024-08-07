import java.util.Scanner;

public class Main {
    static int size = 9;
    static int subSize = 3;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                board[i][j]=sc.nextInt();
            }
        }
        if(solve(board)){
            print(board);
        }
    }
    public static boolean isValid(int[][] board, int row, int col, int num){
        for(int i=0; i<size; i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int i=0; i<size; i++){
            if(board[i][col]==num){
                return false;
            }
        }
        int _row = row-row%subSize;
        int _col = col-col%subSize;
        for(int i=0; i<subSize; i++){
            for(int j=0; j<subSize; j++){
                if(board[_row+i][_col+j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solve(int[][] board){
        int[] check = check(board);
        if(check==null){
            return true;
        }
        int row = check[0];
        int col = check[1];
        for(int num = 1; num<=size; num++){
            if(isValid(board,row,col,num)){
                board[row][col]=num;
                if(solve(board)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }
    public static int[] check(int[][] board){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j]==0){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void print(int[][] board){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}