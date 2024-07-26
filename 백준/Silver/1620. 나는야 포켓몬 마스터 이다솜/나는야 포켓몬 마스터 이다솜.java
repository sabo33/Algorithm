import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<Integer,String> map2 = new HashMap<Integer,String>();
        for (int i = 0; i < n; i++) {
            String name=sc.nextLine();
            map.put(name, i + 1);
            map2.put(i+1,name);
        }
        for(int i=0; i<m; i++){
            String test = sc.nextLine();
            if(test.charAt(0)>='0'&&test.charAt(0)<='9'){
                sb.append(map2.get(Integer.parseInt(test))).append("\n");
            }else {
                sb.append(map.get(test)).append("\n");
            }
        }
        System.out.println(sb);
    }
}