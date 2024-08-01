import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<=n; i++){
            deque.addLast(i);
        }
        for(int i=0; i<n; i++){
            if(deque.size()==1)
                break;
            int first;
            deque.removeFirst();
            first=deque.pollFirst();
            deque.addLast(first);
        }
        System.out.println(deque.peek());
    }
}

