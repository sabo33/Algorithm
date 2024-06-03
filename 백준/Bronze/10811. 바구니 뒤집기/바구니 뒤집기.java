import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] arr = new int[x];
        int temp=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=i+1;
        }

        for(int i=0; i<y; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st2.nextToken());
            int to = Integer.parseInt(st2.nextToken());

            for(int j=to-1, k=from-1; j>k; j--,k++){
                temp=arr[k];
               arr[k]=arr[j];
               arr[j]=temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

}