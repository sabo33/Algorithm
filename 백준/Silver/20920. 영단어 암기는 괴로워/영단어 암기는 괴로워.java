import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            String word = br.readLine();
            if(word.length()<m){
                continue;
            }
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(Integer.compare(map.get(o1),map.get(o2))!=0){
                    return Integer.compare(map.get(o2),map.get(o1));
                }
                if(o1.length()!=o2.length()){
                    return o2.length()-o1.length();
                }
                return  o1.compareTo(o2);
            }
        });
        for(String s : list){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}