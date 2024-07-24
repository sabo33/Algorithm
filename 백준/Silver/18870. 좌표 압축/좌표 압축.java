import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copy = new int[n];
        int rank=0;
        HashMap<Integer,Integer> Map = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            arr[i]=copy[i]=sc.nextInt();
        }
        Arrays.sort(copy);
        for(int i : copy){
            if(!Map.containsKey(i)){
                Map.put(i,rank);
                rank++;
            }
        }
        for(int i : arr){
            int ranking=Map.get(i);
            sb.append(ranking+" ");
        }
        System.out.println(sb);
    }
}