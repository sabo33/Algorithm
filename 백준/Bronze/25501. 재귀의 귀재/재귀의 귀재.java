import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int cnt=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String s = br.readLine();
            sb.append(isPalindrome(s)).append(" ").append(cnt).append("\n");
            cnt=0;
        }
        System.out.println(sb);
    }
    public static int isPalindrome(String s){
        cnt++;
        return recursion(s,0,s.length()-1);
    }
    public static int recursion(String s, int l, int r){
        if(l>=r) return 1;
        else if (s.charAt(l)!=s.charAt(r)) return 0;
        else  {
            cnt++;
            return recursion(s,l+1,r-1);
        }
    }
}