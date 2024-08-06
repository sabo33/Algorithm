import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int cnt = 0;
    public static int m;
    public static int[] tmp;
    public static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        tmp=new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
           arr[i]=Integer.parseInt(st.nextToken());
        }
        merge_sort(arr,0,n-1);
        System.out.println(result);

    }

    public static void merge_sort(int[] arr, int l, int r) {
        if (l < r) {
            int c = (l + r) / 2;
            merge_sort(arr, l, c);
            merge_sort(arr, c + 1, r);
            merge(arr, l, c, r);
        }
    }

    public static void merge(int[] arr, int l, int c, int r) {
       int i=l;
       int j=c+1;
       int k=0;
       while(i<=c && j<=r){
           if(arr[i]<arr[j]){
                tmp[k++] = arr[i++];
           }
           else{
               tmp[k++]=arr[j++];
           }
       }
       while(i<=c){
           tmp[k++]=arr[i++];
       }
       while(j<=r){
           tmp[k++]=arr[j++];
       }
       i=l;
       k=0;
       while(i<=r){
           cnt++;
           if(cnt==m){
               result=tmp[k];
           }
           arr[i++]=tmp[k++];
       }
    }
}