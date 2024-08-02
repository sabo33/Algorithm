import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Deque<Integer> queueStack = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            int result = Integer.parseInt(st2.nextToken());
            if(num==0){
                queueStack.addLast(result);
            }
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int x = Integer.parseInt(st3.nextToken());
            queueStack.addFirst(x);
            sb.append(queueStack.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}

