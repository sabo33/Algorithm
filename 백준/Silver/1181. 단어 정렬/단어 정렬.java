import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length())
                    return o1.compareTo(o2);
                else return o1.length()-o2.length();
            }
        });
        sb.append(arr[0]+"\n");
        for(int i=1; i<n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i] + "\n");
            }
        }
        System.out.println(sb);
    }
}