import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            stack.clear();
            String s = sc.nextLine();
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='('){
                    stack.push(s.charAt(j));
                }
                else if(s.charAt(j)==')'){
                    if(stack.isEmpty()||stack.peek()!='('){
                        stack.push(')');
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            sb.append(stack.empty()?"YES\n":"NO\n");
        }
        System.out.println(sb);
    }
}