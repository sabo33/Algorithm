import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            String str = sc.next();
            switch (str){
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    if(!stack.isEmpty()){
                        int number = stack.pop();
                        sb.append(number).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "top":
                    if(!stack.isEmpty()){
                        int number = stack.peek();
                        sb.append(number).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}