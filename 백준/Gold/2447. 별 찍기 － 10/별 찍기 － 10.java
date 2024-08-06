import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        char[][] canvas = new char[n][n];
        draw(canvas,0,0,n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sb.append(canvas[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void draw(char[][] arr, int x, int y, int size){
        if(size==1){
            arr[x][y]='*';
            return;
        }
        int newSize = size/3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){
                    for(int a=0; a<newSize; a++){
                        for(int b=0; b<newSize; b++){
                            arr[x+i*newSize+a][y+j*newSize+b]=' ';
                        }
                    }
                }else{
                    draw(arr,x+i*newSize,y+j*newSize,newSize);
                }
            }
        }
    }
}
