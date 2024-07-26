import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Boolean> Map = new HashMap<String,Boolean>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt=0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String name = br.readLine();
            Map.put(name,false);
        }
        for(int i=0; i<m; i++){
            String name = br.readLine();
            if(Map.containsKey(name)){
                Map.put(name,true);
            }
        }
        for(java.util.Map.Entry<String,Boolean> entry: Map.entrySet()){
            if(entry.getValue()){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        for(String s : list){
            cnt++;
            sb.append(s).append("\n");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}