import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> Map = new HashMap<String, Integer>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            if(Map.containsKey(arr[i])){
                Map.put(arr[i],Map.get(arr[i])+1);
            }else{
                Map.put(arr[i],1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        String[] compare = br.readLine().split(" ");
        int[] result = new int[m];
        for(int i=0; i<m; i++){
            result[i] = Map.getOrDefault(compare[i], 0);
        }
        for(int i=0; i<m; i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}