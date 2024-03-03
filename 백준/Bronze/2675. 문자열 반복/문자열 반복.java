import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cases = Integer.parseInt(sc.nextLine());
        for (int test = 0; test < cases; test++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < r; j++) {
                    sb.append(s.charAt(i));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}