import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int x = Integer.parseInt(input.split(" ")[0]);
        int y = Integer.parseInt(input.split(" ")[1]);
        int[] arr = new int[x];
        int temp = 0;

        for(int i=0; i<arr.length; i++){
            arr[i]=i+1;
        }

        for(int i=0; i<y; i++){
            String [] result = br.readLine().split(" ");
            temp = arr[Integer.parseInt(result[0])-1];
            arr[Integer.parseInt(result[0])-1]=arr[Integer.parseInt(result[1])-1];
            arr[Integer.parseInt(result[1])-1]=temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}