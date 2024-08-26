import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        long[] answer = new long[m];
        st = new StringTokenizer(br.readLine());
        long count = 0;
        arr[0] = Long.parseLong(st.nextToken());
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1]+Long.parseLong(st.nextToken());
        }

        for(int i=0; i<n; i++){
            int result = (int)(arr[i]%m);
            if(result<0){
                result+=m;
            }
            if(result == 0){
                count++;
            }
            answer[result]++;
        }
        for(int i=0; i<m; i++){
            if(answer[i]>1){
                count+=(answer[i]*(answer[i]-1))/2;
            }
        }
        System.out.println(count);
    }
}
