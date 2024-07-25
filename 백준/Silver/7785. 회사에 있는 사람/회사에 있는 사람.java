import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Boolean> log = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            String value = sc.next();
            if (value.equals("enter")) {
                log.put(key, true);
            } else {
                log.put(key, false);
            }
        }
        List<String> lists = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : log.entrySet()) {
            if (entry.getValue()) {
                lists.add(entry.getKey());
            }
        }
        lists.sort(Collections.reverseOrder());
        for (String key : lists) {
            System.out.println(key);
        }
    }
}