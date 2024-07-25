import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int cnt=0;
        HashMap<String,Boolean> Map = new HashMap<String,Boolean>();
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        for(int i=0; i<n; i++){
            Map.put(br.readLine(),true);
        }
        for(int i=0; i<m; i++){
            if(Map.containsKey(br.readLine())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}