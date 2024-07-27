import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> hashSet = new HashSet<String>();
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<=s.length()-i; j++){
                String result = s.substring(j,j+i);
                hashSet.add(result);
            }
        }
        System.out.print(hashSet.size());
    }
}