import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            if(m==1){
                stack.push(sc.nextInt());
            }
            else if (m==2){
                if(stack.empty()){
                    sb.append(-1).append("\n");
                }
                else {
                    int pop = stack.pop();
                    sb.append(pop).append("\n");
                }
            }
            else if (m==3){
                sb.append(stack.size()).append("\n");
            }
            else if(m==4){
                if(stack.empty()){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else{
                if(stack.empty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}