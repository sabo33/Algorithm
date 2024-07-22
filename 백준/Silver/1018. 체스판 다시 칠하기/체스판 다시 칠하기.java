import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = 64;
        boolean[][] arr = new boolean[n][m];
        for(int i=0; i<n; i++){
            String a =sc.next();
            for(int j=0; j<m; j++){
                if(a.charAt(j)=='W')
                    arr[i][j]=true;
                else
                    arr[i][j]=false;
            }
        }
        int row = n-7;
        int col = m-7;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int x=i+8;
                int y=j+8;
                int cnt=0;
                boolean check = arr[i][j];
                for(int k=i; k<x; k++){
                    for(int t=j; t<y; t++){
                        if(arr[k][t]!=check)
                            cnt++;
                        check=!check;
                    }
                    check=!check;
                }
                cnt=Math.min(cnt,64-cnt);
                min=Math.min(min,cnt);
            }
        }
        System.out.println(min);
    }
}