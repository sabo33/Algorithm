import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt=0;
        sc.nextLine();
        HashMap<Integer, Boolean> A = new HashMap<Integer, Boolean>();
        HashMap<Integer, Boolean> B = new HashMap<Integer, Boolean>();
        for(int i=0; i<a; i++){
            int num = sc.nextInt();
            A.put(num,true);
        }
        for(int i=0; i<b; i++){
            int num = sc.nextInt();
            B.put(num,true);
        }
        for(int i : A.keySet()){
            if (B.containsKey(i)) {
                A.replace(i,false);
                B.replace(i,false);
            }
        }
        for(int i:A.keySet()){
            if(A.get(i)){
                cnt++;
            }
        }
        for(int i:B.keySet()){
            if(B.get(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}