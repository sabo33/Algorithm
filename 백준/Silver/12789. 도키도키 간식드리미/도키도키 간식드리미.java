
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int cnt=1;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){
            if(arr[i]!=cnt){
                if(!stack.isEmpty()&&stack.peek()==cnt){
                    stack.pop();
                    i--;
                    cnt++;
                }else{
                    stack.push(arr[i]);
                }
            }else{
                cnt++;
            }
        }
        boolean check = true;
        for(int i=0; i<stack.size(); i++){
            int num = stack.pop();
            if(num==cnt){
                cnt++;
            }else{
                check=false;
                break;
            }
        }
        System.out.println(check?"Nice":"Sad");

    }
}

