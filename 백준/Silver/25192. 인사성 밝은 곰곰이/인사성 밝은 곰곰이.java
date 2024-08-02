import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = sc.nextInt();
        int result=0;
        sc.nextLine();
        for(int i=0; i<n; i++){
            String s= sc.nextLine();
            if(!s.equals("ENTER")) {
                set.add(s);
            }else {
                result+=set.size();
                set=new HashSet<>();
            }
        }
        result+=set.size();
        System.out.println(result);
    }
}

