import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[] cnt = new int[41];
    static int[] cnt2 = new int[41];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        solve();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            sb.append(cnt[num]).append(" ").append(cnt2[num]).append("\n");
        }
        System.out.println(sb);
    }
    public static void solve(){
        cnt[0]=1;
        cnt[1]=0;
        cnt2[0]=0;
        cnt2[1]=1;
        for(int i=2; i<=40; i++){
            cnt[i]=cnt[i-1]+cnt[i-2];
            cnt2[i]=cnt2[i-1]+cnt2[i-2];
        }
    }
}
