import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Select> deque = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            deque.addLast(new Select(i+1,Integer.parseInt(st.nextToken())));
        }
        while(!deque.isEmpty()){
            int i = deque.peek().index;
            int num = deque.peek().result;
            if(i==1){
                sb.append(deque.remove().index).append(" ");
                if(num>0){
                    num-=1;
                    for(int j=num; j>0; j--){
                        deque.addLast(deque.pollFirst());
                    }
                }
                else {
                    for(int j=num; j<0; j++){
                        deque.addFirst(deque.pollLast());
                    }
                }
                continue;
            }else{
                sb.append(deque.remove().index).append(" ");
                if(deque.isEmpty()) break;
                if(num>0){
                    num-=1;
                    for(int j=num; j>0; j--){
                        deque.addLast(deque.pollFirst());
                    }
                }else {
                    for(int j=num; j<0; j++){
                        deque.addFirst(deque.pollLast());
                    }
                }
            }
        }
        System.out.println(sb);
    }
    public static class Select{
        int index;
        int result;
        Select(int index, int result){
            this.index=index;
            this.result=result;
        }
    }
}

