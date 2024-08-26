import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
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
            String alpha = sc.next();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int idx = alpha.charAt(0) - 'a';
            int result = arr[idx][r+1] - arr[idx][l];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
