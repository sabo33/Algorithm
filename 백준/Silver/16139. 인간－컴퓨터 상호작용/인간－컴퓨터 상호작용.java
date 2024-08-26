import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[26][s.length()+1];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int id = c-'a';

            for (int j = 0; j < 26; j++) {
                arr[j][i + 1] = arr[j][i];
            }
            arr[id][i+1]++;
        }
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String alpha = st.nextToken();
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int idx = alpha.charAt(0) - 'a';
            int result = arr[idx][r+1] - arr[idx][l];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
