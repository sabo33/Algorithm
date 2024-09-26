import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int k = sc.nextInt();
            set.add(k);
        }
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            int k = sc.nextInt();
            if(set.contains(k)){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}