
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = sc.nextLine();
            if(s.equals(".")) break;
            sb.append(check(s)).append("\n");
        }
        System.out.println(sb);
    }
    public static String check(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    stack.push(']');
                }
                else {
                    stack.pop();
                }
            }
            else if (c==')'){
                if (stack.isEmpty() || stack.peek() != '('){
                    stack.push(')');
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) result= "yes";
        else result= "no";
        return result;
    }
}

